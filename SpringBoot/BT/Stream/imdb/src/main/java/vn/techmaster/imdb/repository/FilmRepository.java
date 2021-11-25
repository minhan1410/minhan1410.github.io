package vn.techmaster.imdb.repository;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import vn.techmaster.imdb.model.Film;

@Repository
public class FilmRepository implements IFilmRepo {
    private List<Film> films;

    public FilmRepository(@Value("${datafile}") String datafile) {
        try {
            File file = ResourceUtils.getFile("classpath:static/" + datafile);
            ObjectMapper mapper = new ObjectMapper(); // Dùng để ánh xạ cột trong CSV với từng trường trong POJO
            films = Arrays.asList(mapper.readValue(file, Film[].class));
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public List<Film> getAll() {
        return films;
    }

    @Override
    //Phân loại danh sách film theo quốc gia sản xuất
    public Map<String, List<Film>> getFilmByCountry() {
        return films.stream().collect(Collectors.groupingBy(Film::getCountry));
    }

    @Override
    //Nước nào sản xuất nhiều film nhất, số lượng bao nhiêu?
    public Entry<String, Integer> getcountryMakeMostFilms() {
        var maxFilmByCountry = getFilmByCountry().entrySet().stream()
                .max((o1, o2) -> o1.getValue().size() - o2.getValue().size()).get();

        return Map.entry(maxFilmByCountry.getKey(), maxFilmByCountry.getValue().size());
    }

    @Override
    //Năm nào sản xuất nhiều film nhất, số lượng bao nhiêu?
    public Entry<Integer, Integer> yearMakeMostFilms() {
        var maxFilmByYear = films.stream().collect(Collectors.groupingBy(Film::getYear, Collectors.counting()))
                .entrySet().stream().max((o1, o2) -> (int) (o1.getValue() - o2.getValue())).get();

        return Map.entry(maxFilmByYear.getKey(), maxFilmByYear.getValue().intValue());
    }

    @Override
    //Danh sách tất cả thể loại film
    public List<String> getAllGeneres() {
        Set<String> setGeneres = new LinkedHashSet<>();
        films.stream().forEach(film -> film.getGeneres().stream().forEach(f -> setGeneres.add(f)));

        return new ArrayList<>(setGeneres);
    }

    @Override
    //Tìm film do một quốc gia sản xuất từ năm X đến năm Y
    public List<Film> getFilmsMadeByCountryFromYearToYear(String country, int fromYear, int toYear) {
        return films.stream().filter(film -> film.getCountry().equals(country) && film.getYear() >= fromYear && film.getYear() <= toYear)
                .toList();
    }

    @Override
    //Phân loại film theo thể loại
    public Map<String, List<Film>> categorizeFilmByGenere() {
        Map<String, List<Film>> result = new HashMap<>();
        for (String genere : getAllGeneres()) {
            var list = films.stream().filter(film -> film.getGeneres().contains(genere)).collect(Collectors.toList());
            result.put(genere, list);
        }

//        result.forEach((k, v) -> System.out.println(k + ": " + v.size()));
        return result;
    }

    @Override
    //Top 5 film có lãi lớn nhất margin = revenue - cost
    public List<Film> top5HighMarginFilms() {
        return films.stream().sorted((f1, f2) -> (f2.getRevenue() - f2.getCost()) - (f1.getRevenue() - f1.getCost())).limit(5).toList();
    }

    @Override
    //Top 5 film từ năm 1990 đến 2000 có lãi lớn nhất
    public List<Film> top5HighMarginFilmsIn1990to2000() {
        return films.stream().filter(film -> film.getYear() >= 1990 && film.getYear() <= 2000).sorted((f1, f2) -> (f2.getRevenue() - f2.getCost()) - (f1.getRevenue() - f1.getCost())).limit(5).toList();
    }

    @Override
    //Tỷ lệ phim giữa 2 thể loại
    public double ratioBetweenGenere(String genreX, String genreY) {
        return categorizeFilmByGenere().get(genreX).size() * 1.0 / categorizeFilmByGenere().get(genreY).size();
    }

    @Override
    //Top 5 film có rating cao nhất nhưng lãi thì thấp nhất (thậm chí lỗ)
    public List<Film> top5FilmsHighRatingButLowMargin() {
        return films.stream().sorted(Comparator.comparing(Film::getRating).reversed().thenComparing((f1, f2) -> -(f2.getRevenue() - f2.getCost()) + (f1.getRevenue() - f1.getCost()))).limit(5).toList();
    }
}
