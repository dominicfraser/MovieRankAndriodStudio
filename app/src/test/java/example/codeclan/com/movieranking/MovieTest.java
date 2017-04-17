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
        this.movie1 = new Movie("Movie1","Genre1");
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
}
