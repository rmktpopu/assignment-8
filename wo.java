import java.util.*;

class Movie {
    private String title;
    private String rating;
    private double score;

    public Movie(String title, String rating, double score) {
        this.title = title;
        this.rating = rating;
        this.score = score;
    }

    public String getRating() {
        return rating;
    }

    public double getScore() {
        return score;
    }
}

public class MovieAnalyzer {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Movie1", "PG-13", 7.5));
        movies.add(new Movie("Movie2", "PG", 6.8));
        movies.add(new Movie("Movie3", "R", 8.3));
        movies.add(new Movie("Movie4", "PG-13", 7.9));
        movies.add(new Movie("Movie5", "PG", 6.5));
        movies.add(new Movie("Movie6", "R", 8.1));

        Map<String, Integer> movieCountByRating = new HashMap<>();
        Map<String, Double> totalScoreByRating = new HashMap<>();

        for (Movie movie : movies) {
            String rating = movie.getRating();
            double score = movie.getScore();

            movieCountByRating.put(rating, movieCountByRating.getOrDefault(rating, 0) + 1);
            totalScoreByRating.put(rating, totalScoreByRating.getOrDefault(rating, 0.0) + score);
        }

        System.out.println("Movie Ratings Analysis:");
        for (String rating : movieCountByRating.keySet()) {
            int count = movieCountByRating.get(rating);
            double totalScore = totalScoreByRating.get(rating);
            double averageScore = totalScore / count;
            System.out.println("Rating: " + rating + ", Number of Movies: " + count + ", Average Rating: " + averageScore);
        }
    }
}
