package example.codeclan.com.movieranking;

import java.lang.reflect.Array;

/**
 * Created by user on 17/04/2017.
 */

public class Ranking {
    private Movie[] movies;

    public Ranking() {
        this.movies = new Movie[10];
    }

    public int entriesCount() {
        int count = 0;
        for (Movie movie : movies) {
            if (movie != null) {
                count++;
            }
        }
        return count;
    }

    public void addMovie(Movie movie, int rank) {
        movie.setRank(rank);
        int index = rank - 1;
        this.movies[index] = movie;
    }

    public Movie getMovie(int rank) {
        int index = rank - 1;
        return this.movies[index];
    }

    public Movie findMovie(String title) {
        for(Movie movie : movies) {
            if (movie != null) {
                if (movie.getTitle() == title) {
                    return movie;
                }
            }
        }
        return null;
    }

    public void updateMovie(Movie movie, String operator) {
        if(operator == "+"){
            int current_rank = movie.getRank();
            Movie movie_above = getMovie((current_rank - 1));
            int movie_above_current_rank = movie_above.getRank();
            addMovie(movie_above,(movie_above_current_rank + 1));
            addMovie(movie,(current_rank - 1));
        }
        else if(operator == "-"){
            int current_rank = movie.getRank();
            Movie movie_below = getMovie((current_rank + 1));
            int movie_below_current_rank = movie_below.getRank();
            addMovie(movie_below,(movie_below_current_rank - 1));
            addMovie(movie,(current_rank + 1));
        }

    }
}
