package controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import model.Movie;
import repository.MovieRepository;

public class MovieController {
    MovieRepository movie = new MovieRepository();

    //Tìm phim theo tên
    public void searchMovieByName(List<Movie> list, String name) {       
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getTitle().contains(name)) {
                System.out.println(list.get(i));
            }
        }
    }


    public void searchMovieByCategory(List<Movie> list, String category) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCategory().contains(category)) {
                System.out.println(list.get(i));
            }
        }

    }

    public void searchMovieByLanguage(List<Movie> list, String language) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getLanguage().contains(language)) {
                System.out.println(list.get(i));
            }
        }

    }

    // Đếm số lượng phim theo thể loại

    public void countMovieByCategory(List<Movie> list) {
        Map<String, Integer> countMovieByCategory = new HashMap<>(); //key là tên thể loại, value là số lượng

        for (int i = 0; i < list.size(); i++) { //Lặp list phim
            String category = list.get(i).getCategory(); //Lấy thể loại 
            //Vì 1 phim có nhiều thể loại vd:Drama/Film-Noir/Thriller, nên tách từng cái ra bằng cách cắt chuỗi
            String arrayCategory[] = category.split("/");

            for (int j = 0; j < arrayCategory.length; j++) { //lặp mảng thể loại phim
                Integer countMovie = countMovieByCategory.get(arrayCategory[j]);
                
                if (countMovie == null) {
                    countMovieByCategory.put(arrayCategory[j], 1);
                } else {
                    countMovieByCategory.put(arrayCategory[j], countMovie + 1);
                }
            }

        }


        for (Entry<String, Integer> entry : countMovieByCategory.entrySet()) {
            System.out.printf("%s : %d \n", entry.getKey(), entry.getValue());
        }

    }

}
