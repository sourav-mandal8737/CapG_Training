package Doubly_Linked_List;

public class DoublyLinkedList {
    Node head;
    Node tail;
    static int count;

    // Insert data at the end of the list
    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        count++;
        System.out.println("Node inserted at the end with data: " + data);
    }

    // Display the list in forward direction
    public void displayForward() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = head;
        System.out.print("List (Forward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Display the list in backward direction
    public void displayBackward() {
        if (tail == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node current = tail;
        System.out.print("List (Backward): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
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
            if (head != null) {
                head.prev = node;
            }
            head = node;
            if (tail == null) {
                tail = node;
            }
        } else if (position == count + 1) {
            tail.next = node;
            node.prev = tail;
            tail = node;
        } else {
            Node current = head;
            int currentPosition = 1;
            while (currentPosition < position - 1) {
                current = current.next;
                currentPosition++;
            }
            node.next = current.next;
            node.prev = current;
            if (current.next != null) {
                current.next.prev = node;
            }
            current.next = node;
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
            if (head != null) {
                head.prev = null;
            }
            if (head == null) {
                tail = null;
            }
        } else if (position == count) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            }
        } else {
            Node current = head;
            int currentPosition = 1;
            while (currentPosition < position) {
                current = current.next;
                currentPosition++;
            }
            current.prev.next = current.next;
            if (current.next != null) {
                current.next.prev = current.prev;
            }
        }
        count--;
        System.out.println("Node at position " + position + " deleted.");
    }
    
}





