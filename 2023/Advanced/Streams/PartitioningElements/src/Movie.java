public class Movie {
    private final String title;
    private final Genre genre;
    private final int likes;

    public Movie(String title, Genre genre, int likes) {
        this.title = title;
        this.genre = genre;
        this.likes = likes;
    }

    public String getTitle() {
        return title;
    }

    public int getLikes() {
        return likes;
    }

    public Genre getGenre() {
        return genre;
    }
}
