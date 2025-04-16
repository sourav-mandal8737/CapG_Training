package Lists;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();

        // add element
        a1.add(10);
        a1.add(20);
        a1.add(30);

        System.out.println(a1);

        // add all collection
        ArrayList a2 = new ArrayList(a1);
        a2.add(40);
        a2.add(50);
        a2.add(60);
        a2.add(null);
        a2.add("Hello");
        System.out.println(a2);
        System.out.println(a2.size());

        // add element at a particular position
        a1.add(0,75);
        System.out.println(a1);

        ArrayList a12 = new ArrayList<>();
        a1.add("Hello");
        a12.add("World");

        // add all of collection at a specific index
        a1.addAll(1, a12);
        System.out.println(a1);

        // fetch elememt
        System.out.println(a1.get(2));
        System.out.println(a1.get(1));
    }
}
