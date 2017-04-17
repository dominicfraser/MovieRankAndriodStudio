package example.codeclan.com.movieranking;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class MovieTest {
    Movie movie1;

    @Before
    public void before(){
        movie1 = new Movie("Movie1","Genre1");
    }

    @Test
    public void canGetTitle(){
        assertEquals("Movie1",movie1.getTitle());
    }

    @Test
    public void canGetGenre(){
        assertEquals("Genre1",movie1.getGenre());
    }

    @Test
    public void canGetRank(){
        assertEquals(0,movie1.getRank());
    }

    @Test
    public void canSetTitle(){
        movie1.setTitle("Movie_1");
        assertEquals("Movie_1",movie1.getTitle());
    }

    @Test
    public void canSetGenre(){
        movie1.setGenre("Genre_1");
        assertEquals("Genre_1",movie1.getGenre());
    }

    @Test
    public void canSetRank(){
        movie1.setRank(1);
        assertEquals(1,movie1.getRank());
    }

    @Test
    public void prettifiesDetails(){
        assertEquals("Title: Movie1, Genre: Genre1, Rank: 0",movie1.toString());
    }
}
