package com.company.movieRating;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Movie[] movies = new Movie[10];
        Random random = new Random();
        String[] movieNames = new String[]{"Argo", "Batman", "Con Air", "Dracula", "Enter the Void", "Fight Club", "Gran Torino",
                "Hellboy", "The Island", "John Wick"};




        for (int i = 0; i < movies.length; i++) {
            String name = movieNames[i];
            Movie movie = new Movie(name, random.nextInt(11));
            movies[i] = movie;

        }


        int topRating = 0;
        for (int i = 0; i < movies.length; i++) {
            if(topRating < movies[i].getRating()){
                topRating = movies[i].getRating();
            }
        }



        for (int i = 0; i < movies.length; i++) {

            System.out.println("Movie : " + movies[i].getName() + " Rating : " + movies[i].getRating());

        }
        System.out.println();

        for (int i = 0; i < movies.length; i++) {
            if(movies[i].getRating() == topRating){
                System.out.println("Top rated film: " + movies[i].getName() + " " + movies[i].getRating());
            }

        }

    }
}
