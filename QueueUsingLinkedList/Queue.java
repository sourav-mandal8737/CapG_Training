package QueueUsingLinkedList;

public class Queue {
	 private Node front, rear;
	 private int size;

	 public Queue() {
	     this.front = this.rear = null;
	     this.size = 0;
	 }

	 public boolean isEmpty() {
	     return (front == null);
	 }

	 public int getSize() {
	     return size;
	 }

	 // Enqueue operation
	 public void enqueue(int item) {
	     Node newNode = new Node(item);

	 
	     if (rear == null) {
	         front = rear = newNode;
	     } else {
	
	         rear.next = newNode;
	         rear = newNode;
	     }

	     size++;
	     System.out.println(item + " enqueued to the queue.");
	 }

	 // Dequeue operation
	 public int dequeue() {
	     if (isEmpty()) {
	         System.out.println("Queue is empty. Cannot dequeue.");
	         return -1;
	     }

	     int item = front.data;
	     front = front.next;

	     if (front == null) {
	         rear = null;
	     }

	     size--;
	     return item;
	 }

	 // Peek operation
	 public int peek() {
	     if (isEmpty()) {
	         System.out.println("Queue is empty.");
	         return -1;
	     }
	     return front.data;
	 }

	 // Display the elements of the queue
	 public void displayQueue() {
	     if (isEmpty()) {
	         System.out.println("Queue is empty.");
	         return;
	     }

	     Node temp = front;
	     System.out.println("Queue elements:");
	     while (temp != null) {
	         System.out.print(temp.data + " ");
	         temp = temp.next;
	     }
	     System.out.println();
	 }
	}
