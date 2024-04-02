import java.util.*;

public class StudentTestScores {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        
        List<Integer> scores = new ArrayList<>();
        int totalScore = 0;
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            int score = scanner.nextInt();
            scores.add(score);
            totalScore += score;
        }
        
       
        double averageScore = (double) totalScore / numStudents;
        
      
        Collections.sort(scores);
        
        int medianIndex = numStudents / 2;
        double medianScore;
        if (numStudents % 2 == 0) {
            medianScore = (scores.get(medianIndex - 1) + scores.get(medianIndex)) / 2.0;
        } else {
            medianScore = scores.get(medianIndex);
        }
        
      
        int aboveAverage = 0;
        int atAverage = 0;
        int belowAverage = 0;
        for (int score : scores) {
            if (score > averageScore) {
                aboveAverage++;
            } else if (score == averageScore) {
                atAverage++;
            } else {
                belowAverage++;
            }
        }
        
       
        System.out.println("\nResults:");
        System.out.println("Average Score: " + averageScore);
        System.out.println("Median Score: " + medianScore);
        System.out.println("Number of students above average: " + aboveAverage);
        System.out.println("Number of students at average: " + atAverage);
        System.out.println("Number of students below average: " + belowAverage);
        
        scanner.close();
    }
}
