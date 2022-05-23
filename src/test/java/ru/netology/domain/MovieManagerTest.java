package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {
    Movies one = new Movies(1, "One");
    Movies two = new Movies(2, "Two");
    Movies three = new Movies(3, "Three");
    Movies four = new Movies(4, "Four");
    Movies five = new Movies(5, "Five");
    Movies six = new Movies(6, "Six");
    Movies seven = new Movies(7, "Seven");
    Movies eight = new Movies(8, "Eight");
    Movies nine = new Movies(9, "Nine");
    Movies ten = new Movies(10, "Ten");
    Movies eleven = new Movies(11, "Eleven");

    @Test
    void checkMovieLimit() {
        MovieManager manager = new MovieManager();
        int actual = manager.getLimitMovies();
        int expected = 10;
        assertEquals(expected, actual);
    }

    @Test
    void addMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie(one);
        manager.addMovie(two);
        Movies[] expected = {one, two};
        Movies[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showNullMovie() {
        MovieManager manager = new MovieManager();
        Movies[] expected = {};
        Movies[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void addTenMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        Movies[] expected = {one, two, three, four, five, six, seven, eight, nine, ten};
        Movies[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddAllMovies() {
        MovieManager manager = new MovieManager(11);
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(eleven);
        Movies[] expected = {one, two, three, four, five, six, seven, eight, nine, ten, eleven};
        Movies[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTenMovies() {
        MovieManager manager = new MovieManager(10);
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);
        manager.addMovie(seven);
        manager.addMovie(eight);
        manager.addMovie(nine);
        manager.addMovie(ten);
        manager.addMovie(eleven);
        Movies[] expected = {eleven, ten, nine, eight, seven, six, five, four, three, two};
        Movies[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFiveMovies() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie(one);
        manager.addMovie(two);
        manager.addMovie(three);
        manager.addMovie(four);
        manager.addMovie(five);
        manager.addMovie(six);

        Movies[] expected = {six, five, four, three, two};
        Movies[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}