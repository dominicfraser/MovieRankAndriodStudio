package example.codeclan.com.movieranking;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class RankingTest {
    Ranking topten;
    Ranking topten2;
    Movie movie1;
    Movie movie2;
    Movie movie3;

    @Before
    public void before(){
        topten = new Ranking();
        topten2 = new Ranking();
        movie1 = new Movie("Movie1","Genre1");
        movie2 = new Movie("Movie2","Genre2");
        movie3 = new Movie("Movie3","Genre3");
        topten2.addMovie(movie1,1);
        topten2.addMovie(movie2,2);
        topten2.addMovie(movie3,3);
    }

    @Test
    public void rankingStartsEmpty(){
        assertEquals(0,topten.entriesCount());
    }

    @Test
    public void canAddMovie(){
        topten.addMovie(movie1,1);
        assertEquals(1, topten.entriesCount());
        assertEquals(1, movie1.getRank());
    }

    @Test
    public void canAddMoreMovies(){
        topten.addMovie(movie1,1);
        topten.addMovie(movie2,2);
        assertEquals(2, topten.entriesCount());
        assertEquals(movie1,topten.getMovie(1));
        assertEquals(movie2,topten.getMovie(2));
    }

    @Test
    public void canGetMovieByRank(){
        topten.addMovie(movie1,1);
        assertEquals(movie1,topten.getMovie(1));
    }

    @Test
    public void canFindMovie(){
        topten.addMovie(movie1,1);
        assertEquals(movie1,topten.findMovie("Movie1"));
    }

    @Test
    public void canMoveMovieRankingUp(){
        topten2.updateMovie(movie2,"+");
        assertEquals(movie2,topten2.getMovie(1));
        assertEquals(movie1,topten2.getMovie(2));
        assertEquals(movie3,topten2.getMovie(3));
    }

    @Test
    public void canMoveMovieRankingDown(){
        topten2.updateMovie(movie2,"-");
        assertEquals(movie1,topten2.getMovie(1));
        assertEquals(movie3,topten2.getMovie(2));
        assertEquals(movie2,topten2.getMovie(3));
    }
}
