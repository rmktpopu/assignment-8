import java.util.*;

public class RestaurantRatingAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of restaurants:");
        int numRestaurants = scanner.nextInt();
        
      
        int[] ratings = new int[numRestaurants];
        
      
        System.out.println("Enter ratings for each restaurant (separate by spaces):");
        for (int i = 0; i < numRestaurants; i++) {
            ratings[i] = scanner.nextInt();
        }
      
        int[][] ratingRanges = {{1, 5}, {6, 10}};
        
        
            int lowerBound = range[0];
            int upperBound = range[1];
            int count = 0;
            int sum = 0;
            
            for (int rating : ratings) {
                if (rating >= lowerBound && rating <= upperBound) {
                    count++;
                    sum += rating;
                }
            }
            
            double average = count == 0 ? 0 : (double) sum / count;
            System.out.println("Number of restaurants with rating between " + lowerBound + " and " + upperBound + ": " + count);
            System.out.println("Average rating for this range: " + average);
        }
        
        scanner.close();
    }
}
