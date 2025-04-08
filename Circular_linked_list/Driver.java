package Circular_linked_list;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();
        boolean flag = true;

        while (flag) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Insert data at the end");
            System.out.println("2 - Display the entered data");
            System.out.println("3 - Update a node at a specific position");
            System.out.println("4 - Insert data at a specific position");
            System.out.println("5 - Delete a node at a specific position");
            System.out.println("6 - Exit");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the data:");
                    int data = scan.nextInt();
                    list.insert(data);
                    break;

                case 2:
                    list.display();
                    break;

                case 3:
                    System.out.println("Enter the position to update (starting from 1):");
                    int position = scan.nextInt();
                    System.out.println("Enter the new data:");
                    int newData = scan.nextInt();
                    list.updateAtPosition(position, newData);
                    break;

                case 4:
                    System.out.println("Enter the position to insert (starting from 1):");
                    int insertPosition = scan.nextInt();
                    System.out.println("Enter the data to insert:");
                    int insertData = scan.nextInt();
                    list.insertAtPosition(insertPosition, insertData);
                    break;

                case 5:
                    System.out.println("Enter the position to delete (starting from 1):");
                    int deletePosition = scan.nextInt();
                    list.deleteAtPosition(deletePosition);
                    break;

                case 6:
                    flag = false;
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        scan.close();
    }
}

