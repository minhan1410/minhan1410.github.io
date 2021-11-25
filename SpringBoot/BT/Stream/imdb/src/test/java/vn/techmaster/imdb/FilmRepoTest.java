package vn.techmaster.imdb;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import vn.techmaster.imdb.model.Film;
import vn.techmaster.imdb.repository.FilmRepository;

@SpringBootTest
class FilmRepoTest {
    @Autowired
    private FilmRepository filmRepo;

    @Test
    public void getAll() {
        List<Film> filmList = filmRepo.getAll();
    }

    @Test
    public void getFilmByCountryTest() {
        System.out.println(filmRepo.getFilmByCountry());
    }

    @Test
    public void getFilmByDirectorTest() {
        System.out.println(filmRepo.getcountryMakeMostFilms());
    }

	@Test
    public void getYearMakeMostFilmsTest() {
        System.out.println(filmRepo.yearMakeMostFilms());
    }

    @Test
    public void getAllGeneresTest() {
        System.out.println(filmRepo.getAllGeneres());
    }

    @Test
    public void getFilmsMadeByCountryFromYearToYearTest() {
        System.out.println(filmRepo.getFilmsMadeByCountryFromYearToYear("Brazil",1987,1999));
    }

    @Test
    public void getcategorizeFilmByGenereTest() {
        System.out.println(filmRepo.categorizeFilmByGenere());
    }

    @Test
    public void top5HighMarginFilmsTest() {
        System.out.println(filmRepo.top5HighMarginFilms());
    }

    @Test
    public void top5HighMarginFilmsIn1990to2000Test() {
        System.out.println(filmRepo.top5HighMarginFilmsIn1990to2000());
    }

    @Test
    public void ratioBetweenGenereTest() {
        System.out.println(filmRepo.ratioBetweenGenere("love",""));
    }

    @Test
    public void top5FilmsHighRatingButLowMarginTest() {
        System.out.println(filmRepo.top5FilmsHighRatingButLowMargin());
    }
}
