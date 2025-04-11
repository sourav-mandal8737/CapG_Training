package Hashmap_Implementation;

import java.util.Scanner;

public class HashmapImplementation {
    private Entry[] bucket; 
    private static final int SIZE = 16; 

    public HashmapImplementation() {
        bucket = new Entry[SIZE];
    }

    private int getBucketIndex(int key) {
        return Math.abs(Integer.hashCode(key)) % SIZE;
    }

    public class KeyNotFoundException extends RuntimeException {
        public KeyNotFoundException(String message) {
            super(message);
        }
    }

    public void put(int key, int value) {
        int index = getBucketIndex(key);
        Entry newEntry = new Entry(key, value);

        if (bucket[index] == null) {
            bucket[index] = newEntry;
        } else {
            Entry current = bucket[index];
            while (current != null) {
                if (current.key == key) {
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

    public int get(int key) {
        int index = getBucketIndex(key);
        Entry current = bucket[index];

        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.next;
        }

        throw new KeyNotFoundException("Key " + key + " not found in the hashmap.");
    }

    public void remove(int key) {
        int index = getBucketIndex(key);
        Entry current = bucket[index];
        Entry previous = null;

        while (current != null) {
            if (current.key == key) {
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
            Entry current = bucket[i];
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
        HashmapImplementation hashmap = new HashmapImplementation();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Put (Insert/Update a key-value pair)");
            System.out.println("2. Get (Retrieve a value by key)");
            System.out.println("3. Remove (Delete a key-value pair)");
            System.out.println("4. Display (Show all key-value pairs)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    int putKey = scanner.nextInt();
                    System.out.print("Enter value: ");
                    int putValue = scanner.nextInt();
                    hashmap.put(putKey, putValue);
                    System.out.println("Key-Value pair inserted/updated.");
                    break;

                case 2:
                    System.out.print("Enter key: ");
                    int getKey = scanner.nextInt();
                    try {
                        int value = hashmap.get(getKey);
                        System.out.println("Value for key " + getKey + ": " + value);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    System.out.print("Enter key: ");
                    int removeKey = scanner.nextInt();
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
