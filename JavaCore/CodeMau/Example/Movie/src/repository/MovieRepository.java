package repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import model.Movie;

public class MovieRepository {
    public List<Movie> listMovies;
    public void getData() {
        

        try {
            FileReader reader = new FileReader("movie.json");

            // Chuyển từ JSON text -> object
            Type objectType = new TypeToken<List<Movie>>() {
            }.getType();
            listMovies = new Gson().fromJson(reader, objectType);
            
            for (Movie movie : listMovies) {
                System.out.println(movie);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } 
        
    }

}
