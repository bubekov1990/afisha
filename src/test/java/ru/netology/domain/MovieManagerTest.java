package ru.netology.domain;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieData;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    private MovieManager manager = new MovieManager();

    private MovieData first = new MovieData(1, "Один дома", "jpg", "comedy", true);
    private MovieData second = new MovieData(2, "Драйв", "jpg", "action", true);
    private MovieData third = new MovieData(3, "Достучаться до небес", "jpg", "drama", true);
    private MovieData fourth = new MovieData(4, "Отель", "jpg", "comedy", false);
    private MovieData fifth = new MovieData(5, "Битва за Москву", "jpg", "military drama", true);
    private MovieData sixth = new MovieData(6, "В августе 44-го", "jpg", "military drama", false);
    private MovieData seventh = new MovieData(7, "Интерстеллар", "jpg", "action", true);
    private MovieData eighth = new MovieData(8, "Матрица", "jpg", "action", true);
    private MovieData ninth = new MovieData(9, "Безумный Макс", "jpg", " action ", true);
    private MovieData tenth = new MovieData(10, "Поезд на Юму", "jpg", "western", false);

    @BeforeEach
    void setUp() {
        manager.addFilm(first);
        manager.addFilm(second);
        manager.addFilm(third);
        manager.addFilm(fourth);
        manager.addFilm(fifth);
        manager.addFilm(sixth);
        manager.addFilm(seventh);
        manager.addFilm(eighth);
        manager.addFilm(ninth);
        manager.addFilm(tenth);
    }

    @Test
    void shouldAddAnyNumberOfMovies() {
        manager.addFilm(new MovieData(11, "2012", "jpg", "fantastic", false));
        int expected = 11;
        int actual = manager.getFilmQuantity();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetAllArray() {
        int expected = 10;
        MovieData[] actual = manager.showAll();

        assertEquals(expected, actual.length);
    }