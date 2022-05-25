package org.test.mymovies.Model;

public class Movie {
    public String title, genre, year;
    private int image ;

    public Movie(String title, String genre, String year, int image) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.image = image;


    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getTitle() {

        return title;
    }


    public String getGenre() {

        return genre;
    }


    public String getYear() {

        return year;
    }

}

