package Tree_Set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(2);
        ts.add(5);
        ts.add(3);
        ts.add(8);

        System.out.println(ts); // [2, 3, 5, 8, 10]

        System.out.println(ts.ceiling(3));            // 3
        System.out.println(ts.headSet(3));            // [2]
        System.out.println(ts.headSet(2, true));      // [2]
        System.out.println(ts.lower(1));              // null

        SortedSet<Integer> ss = ts.tailSet(3);
        System.out.println(ss);                       // [3, 5, 8, 10]

        NavigableSet<Integer> n = ts.tailSet(3, true);
        System.out.println(n);                        // [3, 5, 8, 10]

        NavigableSet<Integer> m = ts.tailSet(8, false);
        System.out.println(m);                        // [10]

        // ⭐ Descending Iterator
        System.out.print("Descending order: ");
        Iterator<Integer> descendingIterator = ts.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.print(descendingIterator.next() + " ");
        }
    }
}
