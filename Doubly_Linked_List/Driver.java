package Doubly_Linked_List;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoublyLinkedList list = new DoublyLinkedList();
        boolean flag = true;

        while (flag) {
            System.out.println("\nChoose an option:");
            System.out.println("1 - Insert data at the end");
            System.out.println("2 - Display the entered data (Forward)");
            System.out.println("3 - Display the entered data (Backward)");
            System.out.println("4 - Update a node at a specific position");
            System.out.println("5 - Insert data at a specific position");
            System.out.println("6 - Delete a node at a specific position");
            System.out.println("7 - Exit");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the data:");
                    int data = scan.nextInt();
                    list.insert(data);
                    break;
                case 2:
                    list.displayForward();
                    break;
                case 3:
                    list.displayBackward();
                    break;
                case 4:
                    System.out.println("Enter the position to update (starting from 1):");
                    int positionToUpdate = scan.nextInt();
                    System.out.println("Enter the new data:");
                    int newData = scan.nextInt();
                    list.updateAtPosition(positionToUpdate, newData);
                    break;
                case 5:
                    System.out.println("Enter the position to insert (starting from 1):");
                    int positionToInsert = scan.nextInt();
                    System.out.println("Enter the data to insert:");
                    int dataToInsert = scan.nextInt();
                    list.insertAtPosition(positionToInsert, dataToInsert);
                    break;
                case 6:
                    System.out.println("Enter the position to delete (starting from 1):");
                    int positionToDelete = scan.nextInt();
                    list.deleteAtPosition(positionToDelete);
                    break;
                case 7:
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


