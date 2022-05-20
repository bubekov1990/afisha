package ru.netology.domain;

import ru.netology.domain.MovieData;

public class MovieManager {
    private MovieData[] films;
    private int filmsNumber;



    public void addFilm(MovieData film) {
        MovieData[] collection = new MovieData[films.length + 1];
        System.arraycopy(films, 0, collection, 0, films.length);
        collection[collection.length - 1] = film;
        films = collection;
    }

    public MovieManager(int filmsNumber) {
        this.filmsNumber = filmsNumber;
        this.films = new MovieData[0];
    }

    public MovieManager() {
        this(10);
    }

    public MovieData[] showAll() {
        int resultLength;
        if (films.length > filmsNumber) {
            resultLength = filmsNumber;
        } else {
            resultLength = films.length;
        }
        MovieData[] result = new MovieData[resultLength];

        for (int i = 0; i < resultLength; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public int getFilmQuantity() {
        return films.length;
    }
}