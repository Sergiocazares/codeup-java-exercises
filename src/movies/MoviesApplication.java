package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] originalMovieList = MoviesArray.findAll();
        System.out.println("What would you like to watch?");
        System.out.println();

        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("6 - view movies in the musical category");
        System.out.println("7 - add a new movie");
        System.out.println();

        displayMovieList(originalMovieList);

    }

    public static void displayMovieList(Movie[] movieList) {
        Input input = new Input();
        int userChoice = input.getInt("Enter your choice: ");
        if(userChoice != 0 && userChoice != 7) {
            switch (userChoice) {
                case 1:
                    getMovieList(movieList);
                    break;
                case 2:
                    getMovieList(movieList,"animated");
                    break;
                case 3:
                    getMovieList(movieList,"drama");
                    break;
                case 4:
                    getMovieList(movieList,"horror");
                    break;
                case 5:
                    getMovieList(movieList,"scifi");
                    break;
                case 6:
                    getMovieList(movieList,"musical");
                    break;
            }
            displayMovieList(movieList);
        } else if (userChoice == 7){
            displayMovieList(addNewMovie());
        }
    }


    public static void getMovieList(Movie[] movieList) {
        for(Movie movie : movieList) {
            System.out.printf("%s -- %s\n", movie.getMovieName(), movie.getMovieCategory());
        }
        System.out.println();
    }

    public static void getMovieList(Movie[] movieList, String category) {
        for(Movie movie : movieList) {
            String movieCategory = movie.getMovieCategory();
            if(movieCategory.equalsIgnoreCase(category)) {
                System.out.printf("%s -- %s\n", movie.getMovieName(), movie.getMovieCategory());
            }
        }
        System.out.println();
    }

    public static Movie[] addNewMovie() {
        Movie[] movieList = MoviesArray.findAll();
        Input input = new Input();
        String userMovieName = input.getString("Enter a movie name.");
        String userMovieCategory = input.getString("Is the movie animated, drama, horror, musical or scifi?");
        userMovieCategory = userMovieCategory.toLowerCase();

        Movie[] userMovieArray = Arrays.copyOf(movieList, movieList.length + 1);
        userMovieArray[userMovieArray.length - 1] = new Movie(userMovieName, userMovieCategory);

        System.out.println("Your movie has been added.");
        return userMovieArray;
    }
}