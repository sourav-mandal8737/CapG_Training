package Encapsulation;

import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {
        Student student = new Student("Ram Roy", 22, "Male", "Computer Science", "ramroy1@gmail.com", "1234");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Fetch Student Details");
            System.out.println("2. Update Student Details");
            System.out.println("3. Update Password");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine(); 
            if (option == 1) {
                student.fetchDetails();
            } else if (option == 2) {
                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();

                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new age: ");
                int newAge = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter new gender: ");
                String newGender = scanner.nextLine();
                System.out.print("Enter new branch: ");
                String newBranch = scanner.nextLine();

                student.updateDetails(email, password, newName, newAge, newGender, newBranch);
            } else if (option == 3) {
                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                System.out.print("Enter old password: ");
                String oldPassword = scanner.nextLine();
                System.out.print("Enter new password: ");
                String newPassword = scanner.nextLine();
                System.out.print("Retype new password: ");
                String retypedPassword = scanner.nextLine();

                student.updatePassword(email, oldPassword, newPassword, retypedPassword);
            } else if (option == 4) {
                System.out.println("Exiting the system...");
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}
