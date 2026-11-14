public class assignment1 {
    public static void main(String[] args) {

        // 1. Use print() to display the student's name and registration number
        System.out.print("Student Name: John Doe");
        System.out.print("     Registration Number: REG2024001\n");

        System.out.println("----------------------------------------");

        // 2. Use println() to display the three subject names and marks
        System.out.println("Subject              Mark");
        System.out.println("----------------------------------------");
        System.out.println("Programming          82");
        System.out.println("Internet Technology  75");
        System.out.println("Networks             68");
        System.out.println("----------------------------------------");

        // 3. Calculate total mark and display using printf()
        int programming = 82;
        int internetTechnology = 75;
        int networks = 68;

        int total = programming + internetTechnology + networks;
        System.out.printf("Total Mark: %d%n", total);

        // 4. Calculate and display average mark to two decimal places using printf()
        double average = (double) total / 3;
        System.out.printf("Average Mark: %.2f%n", average);
    }
}
