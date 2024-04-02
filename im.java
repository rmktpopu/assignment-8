import java.util.ArrayList;
import java.util.List;

class Project {
    private String studentName;
    private int completionTime;

    public Project(String studentName, int completionTime) {
        this.studentName = studentName;
        this.completionTime = completionTime;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getCompletionTime() {
        return completionTime;
    }
}

public class ProjectCompletionAnalyzer {
    private List<Project> projects;

    public ProjectCompletionAnalyzer() {
        this.projects = new ArrayList<>();
    }

    public void addProject(String studentName, int completionTime) {
        projects.add(new Project(studentName, completionTime));
    }

    public void analyzeProjects() {
        int onTimeCount = 0;
        int earlyCount = 0;
        int lateCount = 0;
        double totalCompletionTime = 0;

        for (Project project : projects) {
            totalCompletionTime += project.getCompletionTime();

   
            if (project.getCompletionTime() <= 0) {
                onTimeCount++;
            } else if (project.getCompletionTime() < 0) {
                earlyCount++;
            } else {
                lateCount++;
            }
        }

        double averageCompletionTime = totalCompletionTime / projects.size();

        System.out.println("Number of projects completed on time: " + onTimeCount);
        System.out.println("Number of projects completed early: " + earlyCount);
        System.out.println("Number of projects completed late: " + lateCount);
        System.out.println("Average time taken for projects completion: " + averageCompletionTime);
    }

    public static void main(String[] args) {
        ProjectCompletionAnalyzer analyzer = new ProjectCompletionAnalyzer();
        analyzer.addProject("Alice", 5);
        analyzer.addProject("Bob", -2);
        analyzer.addProject("Charlie", 0);
        analyzer.analyzeProjects();
    }
}
