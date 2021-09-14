package com.minhan.film.Model;

public class Film {
    private String directorName;
    private String filmName;
    private int year;

    public Film() {
    }

    public Film(String filmName, String directorName, int year) {
        this.directorName = directorName;
        this.filmName = filmName;
        this.year = year;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
