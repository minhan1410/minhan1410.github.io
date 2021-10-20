package com.minhan.lamlai.Repository;

import com.minhan.lamlai.Model.Film;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class FilmDao extends Dao<Film> {
    public FilmDao() {
        add(new Film(1, "Birds of Prey", "Phim Hành động, Phim Phiêu Lưu", "http://tvhai.org/xem-phim-cuoc-lot-xac-huy-hoang-cua-harley-quinn-469332", "https://1.bp.blogspot.com/-Yn3moCFn-Ks/XmxFYpzi2oI/AAAAAAAAWbk/aGxRXCyrsiUD_epdSARVmHgAvo-1gnMtACLcBGAsYHQ/s1600/1-2--birds-of-prey--vietnamese--poster.jpg", 2020));
        add(new Film(2, "The New Mutants", "Phim Hành động", "http://tvhai.org/xem-phim-di-nhan-the-he-moi-507709", "https://1.bp.blogspot.com/-FnHiJdjAKHE/X7CBexVkduI/AAAAAAAAAS0/PfeixdWFEGo1gycKwXh9ipkhqbFYOUtVACLcBGAsYHQ/w298-h448/5fa51817ac08f_aaaa%25281%2529.jpg", 2020));
        add(new Film(3, "Wonder Woman 1984", "Phim Hành động, Phim Thần Thoại, Phim Viễn Tưởng", "http://tvhai.org/xem-phim-nu-than-chien-binh-1984-512058", "https://1.bp.blogspot.com/-9l_3ASDr0wc/X-0buttUcmI/AAAAAAAAAbY/VOdcUBJKKnYWk61T5gaNKOyAmifU8kYrQCLcBGAsYHQ/w267-h395/wonder_woman_1984-_vietnamese_poster_1__2.jpg", 2020));
        add(new Film(4, "Mulan", "Phim Chiến Tranh, Phim Cổ Trang, Phim Hành động", "http://tvhai.org/xem-phim-hoa-moc-lan-2020-498858", "https://static.mservice.io/blogscontents/momo-upload-api-200213111622-637171893826164966.jpg", 2020));
        add(new Film(5, "Tenet", "Phim Hành động, Phim Viễn Tưởng", "http://tvhai.org/xem-phim-tenet-509105", "https://static.mservice.io/blogscontents/momo-upload-api-200213112753-637171900733613290.jpg", 2020));
    }

    @Override
    public Optional<Film> getById(int id) {
        return list.stream().filter(film -> film.getId() == id).findFirst();
    }

    @Override
    public List<Film> getAll() {
        return list;
    }

    @Override
    public void add(Film film) {
        int id;
        if (list.isEmpty()) {
            id = 1;
        } else {
            id = list.size() + 1;
        }
        film.setId(id);
        list.add(film);
    }

    @Override
    public void update(Film film) {
        getById(film.getId()).ifPresent(f -> {
            f.setId(film.getId());
            f.setName(film.getName());
            f.setTitle(film.getTitle());
            f.setLink(film.getLink());
            f.setPhoto(film.getPhoto());
            f.setYear(film.getYear());
        });
    }

    @Override
    public void deleteById(int id) {
        getById(id).ifPresent(f -> list.remove(f));
    }

    @Override
    public List<Film> searchByKeyword(String keyword) {
        return list.stream().filter(f -> f.matchWithKeyword(keyword)).collect(Collectors.toList());
    }
}
