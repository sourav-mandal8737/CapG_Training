
package StackUsingLinkedList;

public class Stack {
    private Node top;

    public Stack() {
        top = null; 
    }

    public boolean isEmpty() {
        return top == null;
    }

    // Push operation
    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;  
        top = newNode;       
        System.out.println(value + " pushed to stack");
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;  
        } else {
            int poppedValue = top.data;
            top = top.next; 
            return poppedValue;
        }
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;  
        } else {
            return top.data;
        }
    }

    // Display operation
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            Node current = top;
            System.out.print("Stack elements: ");
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
