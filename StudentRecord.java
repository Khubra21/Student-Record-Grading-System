
import java.util.Scanner;

public class StudentRecord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Get student details
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        // Step 2: Get subject marks
        System.out.print("Enter marks in 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        // Step 3: Calculate total and percentage
        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        // Step 4: Calculate grade
        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 80) {
            grade = "A";
        } else if (percentage >= 70) {
            grade = "B";
        } else if (percentage >= 60) {
            grade = "C";
        } else if (percentage >= 40) {
            grade = "D";
        } else {
            grade = "Fail";
        }

        // Step 5: Display student report
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
