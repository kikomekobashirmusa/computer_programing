import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {

        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        String studentName;
        int    studentAge;
        double gpa;
        char   grade;
        boolean isEnrolled;

        // Initialize variables by prompting the user
        System.out.print("Enter your name: ");
        studentName = input.nextLine();

        System.out.print("Enter your age: ");
        studentAge = input.nextInt();

        System.out.print("Enter your GPA (e.g. 3.75): ");
        gpa = input.nextDouble();

        System.out.print("Enter your grade (A, B, C, D or F): ");
        grade = input.next().charAt(0);

        System.out.print("Are you currently enrolled? (true/false): ");
        isEnrolled = input.nextBoolean();

        // Display the output
        System.out.println("\n===== Student Information =====");
        System.out.println("Name:      " + studentName);
        System.out.println("Age:       " + studentAge);
        System.out.printf ("GPA:       %.2f%n", gpa);
        System.out.println("Grade:     " + grade);
        System.out.println("Enrolled:  " + isEnrolled);
        System.out.println("===============================");

        // Close the scanner
        input.close();
    }
}
