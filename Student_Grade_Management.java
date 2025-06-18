import java.util.*;
public class Student_Grade_Management {
    static String name1, name2, name3;
    static int grade1, grade2, grade3;
    static boolean studentsAdded = false;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            // Menu
            System.out.println("\nStudent Grade Management");
            System.out.println("1. Add 3 Students");
            System.out.println("2. Show Report");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();
            input.nextLine(); // clear newline

            if (choice == 1) {
                addStudents(input);
            } else if (choice == 2) {
                showReport();
            } else if (choice == 3) {
                searchStudent(input);
            } else if (choice == 4) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }

    static void addStudents(Scanner input) {
        System.out.print("Enter name of student 1: ");
        name1 = input.nextLine();
        System.out.print("Enter grade of " + name1 + ": ");
        grade1 = input.nextInt();
        input.nextLine();

        System.out.print("Enter name of student 2: ");
        name2 = input.nextLine();
        System.out.print("Enter grade of " + name2 + ": ");
        grade2 = input.nextInt();
        input.nextLine();

        System.out.print("Enter name of student 3: ");
        name3 = input.nextLine();
        System.out.print("Enter grade of " + name3 + ": ");
        grade3 = input.nextInt();
        input.nextLine();

        studentsAdded = true;
        System.out.println("Students added successfully!");
    }

    static void showReport() {
        if (!studentsAdded) {
            System.out.println("Please add students first.");
            return;
        }

        int total = grade1 + grade2 + grade3;
        double average = total / 3.0;

        int highest = Math.max(grade1, Math.max(grade2, grade3));
        int lowest = Math.min(grade1, Math.min(grade2, grade3));

        System.out.println("\n--- Report ---");
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("Highest Grade: " + highest);
        System.out.println("Lowest Grade : " + lowest);
    }

    static void searchStudent(Scanner input) {

        if (!studentsAdded) {
            System.out.println("Please add students first.");
            return;
        }

        System.out.print("Enter student name to search: ");
        String search = input.nextLine();
        boolean found = false;

        if (search.equalsIgnoreCase(name1)) {
            System.out.println("Student found.");
            System.out.println(name1 + " - Grade: " + grade1);
            found = true;
        } else if (search.equalsIgnoreCase(name2)) {
            System.out.println("Student found.");
            System.out.println(name2 + " - Grade: " + grade2);
            found = true;
        } else if (search.equalsIgnoreCase(name3)) {
            System.out.println("Student found.");
            System.out.println(name3 + " - Grade: " + grade3);
            found = true;
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}
