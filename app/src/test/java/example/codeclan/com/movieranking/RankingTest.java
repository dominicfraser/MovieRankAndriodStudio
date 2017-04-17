package example.codeclan.com.movieranking;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/04/2017.
 */

public class RankingTest {
    Ranking topten;
    Movie movie1;

    @Before
    public void before(){
        topten = new Ranking();
        movie1 = new Movie("Movie1","Genre1");
    }

    @Test
    public void rankingStartsEmpty(){
        assertEquals(0,topten.entriesCount());
    }
}
