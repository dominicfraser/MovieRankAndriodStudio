package example.codeclan.com.movieranking;

/**
 * Created by user on 17/04/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int rank;

    public Movie(String title, String genre){
        this.title = title;
        this.genre = genre;
        this.rank = 0;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getRank() {
        return this.rank;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString(){
        return "Title: " + this.title + ", Genre: " + this.genre + ", Rank: " + this.rank;
    }
}
