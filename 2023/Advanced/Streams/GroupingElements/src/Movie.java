public class Movie {
    private String title;
    private int likes;
    private Genre genre;

    public Movie(String name, int likes, Genre genre) {
        this.title = name;
        this.likes = likes;
        this.genre = genre;
    }

    public int getLikes() {
        return likes;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }
}
