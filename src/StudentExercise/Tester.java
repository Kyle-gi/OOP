package StudentExercise;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeManager manager = new GradeManager();
        int option;

        do {
            System.out.println("\n=== STUDENT GRADE MANAGER ===");
            System.out.println("1. Add student");
            System.out.println("2. List all students");
            System.out.println("3. Show average grade");
            System.out.println("4. Show top student");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter student grade (0-10): ");
                    double grade = sc.nextDouble();
                    sc.nextLine();

                    Student s = new Student(name, grade);
                    manager.addStudent(s);
                    break;

                case 2:
                    manager.listStudents();
                    break;

                case 3:
                    double average = manager.calculateAverage();
                    if (average > 0) {
                        System.out.println("Average grade: " + average);
                    }
                    break;

                case 4:
                    manager.findTopStudent();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        } while (option != 0);

        sc.close();
    }
}
