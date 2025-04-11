
package Hashmap_Implementation1;

import java.util.Scanner;

public class HashmapImplementation1 {

    private Entry1[] bucket;
    private static final int SIZE = 16;

    public HashmapImplementation1() {
        bucket = new Entry1[SIZE];
    }

    private int getBucketIndex(Object key) {
        return Math.abs(key.hashCode()) % SIZE;
    }

    public class KeyNotFoundException extends RuntimeException {
      
		private static final long serialVersionUID = 1L;

		public KeyNotFoundException(String message) {
            super(message);
        }
    }

    public void put(Object key, Object value) {
        int index = getBucketIndex(key);
        Entry1 newEntry = new Entry1(key, value);

        if (bucket[index] == null) {
            bucket[index] = newEntry;
        } else {
            Entry1 current = bucket[index];
            while (true) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                if (current.next == null) {
                    current.next = newEntry;
                    return;
                }
                current = current.next;
            }
        }
    }

    public Object get(Object key) {
        int index = getBucketIndex(key);
        Entry1 current = bucket[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }

        throw new KeyNotFoundException("Key \"" + key + "\" not found in the hashmap.");
    }

    public void remove(Object key) {
        int index = getBucketIndex(key);
        Entry1 current = bucket[index];
        Entry1 previous = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    bucket[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public void display() {
        for (int i = 0; i < SIZE; i++) {
            Entry1 current = bucket[i];
            if (current != null) {
                System.out.print("Bucket " + i + ": ");
                while (current != null) {
                    System.out.print("[" + current.key + ":" + current.value + "] ");
                    current = current.next;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashmapImplementation1 hashmap = new HashmapImplementation1();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Put (Insert/Update a key-value pair)");
            System.out.println("2. Get (Retrieve a value by key)");
            System.out.println("3. Remove (Delete a key-value pair)");
            System.out.println("4. Display (Show all key-value pairs)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter key (String): ");
                    String putKey = scanner.nextLine();
                    System.out.print("Enter value (String): ");
                    String putValue = scanner.nextLine();
                    hashmap.put(putKey, putValue);
                    System.out.println("Key-Value pair inserted/updated.");
                    break;

                case 2:
                    System.out.print("Enter key (String): ");
                    String getKey = scanner.nextLine();
                    try {
                        Object value = hashmap.get(getKey);
                        System.out.println("Value for key \"" + getKey + "\": " + value);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter key (String): ");
                    String removeKey = scanner.nextLine();
                    hashmap.remove(removeKey);
                    System.out.println("Key-Value pair removed.");
                    break;

                case 4:
                    hashmap.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
