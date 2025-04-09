package QueueUsingLinkedList;

import java.util.Scanner;

public class Driver {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     Queue queue = new Queue();

     int choice;
     do {
         System.out.println("\n--- Queue Operations ---");
         System.out.println("1. Enqueue");
         System.out.println("2. Dequeue");
         System.out.println("3. Peek");
         System.out.println("4. Display Queue");
         System.out.println("5. Check if Queue is Empty");
         System.out.println("6. Exit");
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 System.out.print("Enter the element to enqueue: ");
                 int enqueueElement = sc.nextInt();
                 queue.enqueue(enqueueElement);
                 break;

             case 2:
                 int dequeuedElement = queue.dequeue();
                 if (dequeuedElement != -1) {
                     System.out.println("Dequeued: " + dequeuedElement);
                 }
                 break;

             case 3:
                 int frontElement = queue.peek();
                 if (frontElement != -1) {
                     System.out.println("Front element: " + frontElement);
                 }
                 break;

             case 4:
                 queue.displayQueue();
                 break;

             case 5:
                 if (queue.isEmpty()) {
                     System.out.println("Queue is empty.");
                 } else {
                     System.out.println("Queue is not empty.");
                 }
                 break;

             case 6:
                 System.out.println("Exiting...");
                 break;

             default:
                 System.out.println("Invalid choice. Please try again.");
         }
     } while (choice != 7);

     sc.close();
 }
}


