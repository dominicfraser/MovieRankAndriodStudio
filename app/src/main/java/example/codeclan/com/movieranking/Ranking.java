package example.codeclan.com.movieranking;

import java.lang.reflect.Array;

/**
 * Created by user on 17/04/2017.
 */

public class Ranking {
    private Movie[] movies;

    public Ranking(){
        this.movies = new Movie[10];
    }

    public int entriesCount() {
        int count = 0;
        for(Movie movie : movies){
            if(movie != null){
                count ++;
            }
        }
        return count;
    }
}
