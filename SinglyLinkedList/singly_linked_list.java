package SinglyLinkedList;

public class singly_linked_list {
    Node head;
    Node tail;
    static int count;

    // Insert data at the end of the list
    public void insert(int data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
            count++;
        } else {
            tail.next = node;
            tail = node;
            count++;
        }
    }

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        System.out.print("Entered data: ");
        while (current != null) {
            System.out.print(current.data + " "); 
            current = current.next;
        }
        System.out.println(); 
    }

    // Update a node at a specific position
    public void updateAtPosition(int position, int newData) {
        if (position < 1 || position > count) {
            System.err.println("Invalid position. Please enter a position between 1 and " + count);
            return;
        }

        Node current = head;
        int currentPosition = 1;

        while (currentPosition < position) {
            current = current.next;
            currentPosition++;
        }

        current.data = newData;
        System.out.println("Node at position " + position + " updated to " + newData);
    }

    // Insert data at a specific position
    public void insertAtPosition(int position, int data) {
        if (position < 1 || position > count + 1) {
            System.err.println("Invalid position. Please enter a position between 1 and " + (count + 1));
            return;
        }

        Node node = new Node(data);

        if (position == 1) { 
            node.next = head;
            head = node;
            if (tail == null) { 
                tail = node;
            }
        } else {
            Node current = head;
            int currentPosition = 1;

            while (currentPosition < position - 1) {
                current = current.next;
                currentPosition++;
            }

            node.next = current.next;
            current.next = node;

            if (node.next == null) { 
                tail = node;
            }
        }
        count++;
        System.out.println("Node inserted at position " + position + " with data " + data);
    }

    // Delete a node at a specific position
    public void deleteAtPosition(int position) {
        if (position < 1 || position > count) {
            System.err.println("Invalid position. Please enter a position between 1 and " + count);
            return;
        }

        if (position == 1) { 
            head = head.next;
            if (head == null) { 
                tail = null;
            }
        } else {
            Node current = head;
            int currentPosition = 1;

            while (currentPosition < position - 1) {
                current = current.next;
                currentPosition++;
            }

            current.next = current.next.next;

            if (current.next == null) { 
                tail = current;
            }
        }
        count--;
        System.out.println("Node at position " + position + " deleted.");
    }
}
