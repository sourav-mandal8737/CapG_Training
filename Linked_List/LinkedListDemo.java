package Linked_List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();

        studentList.add(new Student(1, "Gobinda", 88.5));
        studentList.add(new Student(2, "Murari", 91.0));
        studentList.add(new Student(3, "Mohan", 78.2));
        studentList.add(new Student(4, "Murli", 85.3));

        studentList.push(new Student(5, "Basudev", 99));
        studentList.pop();
        studentList.addFirst(new Student(6, "Krishna", 100));
        studentList.addLast(new Student(7, "Monahar", 98));

        System.out.println("The peek element is: " + studentList.peek());

        System.out.println("\nOriginal List:");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // Sorting by name using Comparable
        Collections.sort(studentList);
        System.out.println("\nSorted by Name (using Comparable):");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // Sorting by marks using Comparator
        Collections.sort(studentList, new MarksComparator());
        System.out.println("\nSorted by Marks (using Comparator):");
        for (Student s : studentList) {
            System.out.println(s);
        }

        // Using Iterator
        System.out.println("\nTraversing using Iterator:");
        Iterator<Student> itr = studentList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Using ListIterator (in reverse)
        System.out.println("\nTraversing using ListIterator (in reverse):");
        ListIterator<Student> listItr = studentList.listIterator(studentList.size());
        while (listItr.hasPrevious()) {
            System.out.println(listItr.previous());
        }

        // Using Descending Iterator
        System.out.println("\nTraversing using Descending Iterator:");
        Iterator<Student> descItr = studentList.descendingIterator();
        while (descItr.hasNext()) {
            System.out.println(descItr.next());
        }
    }
}


