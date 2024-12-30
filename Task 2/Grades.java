import java.util.Scanner;

    public class Grades {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the number of subjects: ");
            int subjects = scanner.nextInt();
            int total = 0;
    
            for (int i = 1; i <= subjects; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                int mark = scanner.nextInt();
                total += mark;
            }
    
            double average = (double) total / subjects;
            String grade;
    
            if (average >= 90) {
                grade = "A";
            } else if (average >= 80) {
                grade = "B";
            } else if (average >= 70) {
                grade = "C";
            } else if (average >= 60) {
                grade = "D";
            } else {
                grade = "F";
            }
    
            System.out.println("Total Marks: " + total);
            System.out.println("Average Percentage: " + average + "%");
            System.out.println("Grade: " + grade);
    
            scanner.close();
        }
    }
