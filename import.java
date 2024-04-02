import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class BookReview {
    private String title;
    private int rating; 
    public BookReview(String title, int rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public int getRating() {
        return rating;
    }
}

public class BookReviewAnalyzer {

    public static void main(String[] args) {
        List<BookReview> reviews = new ArrayList<>();
        reviews.add(new BookReview("Book 1", 7));
        reviews.add(new BookReview("Book 2", 4));
        reviews.add(new BookReview("Book 3", 9));
        reviews.add(new BookReview("Book 4", 2));
        reviews.add(new BookReview("Book 5", 6));
        reviews.add(new BookReview("Book 6", 8));
        reviews.add(new BookReview("Book 7", 3));
        reviews.add(new BookReview("Book 8", 10));

        int[] ratingRanges = {1, 5, 6, 10};

        Map<String, Integer> ratingCounts = new HashMap<>();
        ratingCounts.put("1-5 stars", 0);
        ratingCounts.put("6-10 stars", 0);

        int positiveCount = 0;
        int neutralCount = 0;
        int negativeCount = 0;

        for (BookReview review : reviews) {
            int rating = review.getRating();
            if (rating >= ratingRanges[0] && rating <= ratingRanges[1]) {
                ratingCounts.put("1-5 stars", ratingCounts.get("1-5 stars") + 1);
            } else if (rating >= ratingRanges[2] && rating <= ratingRanges[3]) {
                ratingCounts.put("6-10 stars", ratingCounts.get("6-10 stars") + 1);
            }

           
            if (rating >= 7) {
                positiveCount++;
            } else if (rating >= 4) {
                neutralCount++;
            } else {
                negativeCount++;
            }
        }

        System.out.println("Books reviewed within rating ranges:");
        for (Map.Entry<String, Integer> entry : ratingCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nCount of books with positive, neutral, and negative reviews:");
        System.out.println("Positive: " + positiveCount);
        System.out.println("Neutral: " + neutralCount);
        System.out.println("Negative: " + negativeCount);
    }
}
