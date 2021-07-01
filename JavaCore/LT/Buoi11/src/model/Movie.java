package model;

public class Movie {
    private long id;
    private String title;
    private String category;
    private String director;
    private String language;
    private int publishingYear;
    private String publishingCompany;
    private int time; 

    public Movie(long id, String title, String category, String director, String language, int publishingYear,
            String publishingCompany, int time) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.language = language;
        this.publishingYear = publishingYear;
        this.publishingCompany = publishingCompany;
        this.time = time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + category + " - " + director + " - " + language + " - " +
        publishingYear + " - " + publishingCompany + " - " + time;
    }
}