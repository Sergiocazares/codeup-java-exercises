package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getMovieName() {
        return this.name;
    }

    public void setMovieName(String name) {
        this.name = name;
    }

    public String getMovieCategory() {
        return this.category;
    }

    public void setMovieCategory(String category) {
        this.category = category;
    }
}