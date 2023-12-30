package com.blog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainUtil4 {
    public static void main(String[] args) {
        Movie movie1 = new Movie("aaa",9,1999);
        Movie movie2 = new Movie("bbb",6,2000);
        Movie movie3 = new Movie("ccc",8,1986);

        List<Movie> list = Arrays.asList(movie1,movie2,movie3);

        MovieYear movieYear = new MovieYear();
        MovieRating movieRating = new MovieRating();
        MovieName movieName = new MovieName();


        Collections.sort(list,movieYear);
        for (Movie m:list) {
            System.out.println(m.getName());
            System.out.println(m.getRating());
            System.out.println(m.getYear());
        }
        Collections.sort(list,movieRating);
        for (Movie m:list) {
            System.out.println(m.getName());
            System.out.println(m.getRating());
            System.out.println(m.getYear());
        }
        Collections.sort(list,movieName);

        for (Movie m:list) {
            System.out.println(m.getName());
            System.out.println(m.getRating());
            System.out.println(m.getYear());
        }
    }
}
