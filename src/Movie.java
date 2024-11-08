public class Movie  implements Comparable<Movie> {
    private String name;
    private String artist;
    private double budget;
    private float rating;
    private int year;


    public Movie(String name, String artist, double budget, float rating, int year) {
        this.name = name;
        this.artist = artist;
        this.budget = budget;
        this.rating = rating;
        this.year = year;
    }


    @Override
    public String toString() {
        return
                "name=" + name + "| " +
                "artist= " + artist +
                "| budget=" + budget +
                "| rating=" + rating +
                "| year=" + year
                ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Movie o) {
        return this.getName().compareTo(o.getName());
    }
}
