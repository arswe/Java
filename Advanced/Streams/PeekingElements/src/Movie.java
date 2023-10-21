public class Movie {
    private String title;
    private int likes;

    public Movie(String title, int likes) {
        this.title = title; // set the title
        this.likes = likes; // set the number of likes
    }

    public String getTitle() {
        return title; // return the title
    }

    public int getLikes() {
        return likes; // return the number of likes
    }

}
