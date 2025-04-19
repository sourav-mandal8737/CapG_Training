package Map_Collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, Object> tm1 = new TreeMap<>((o1, o2) -> (Integer) o2 - (Integer) o1);
        tm1.put(2, "Hello");
        tm1.put(9, 89);
        tm1.put(5, "d");
        System.out.println(tm1);
        System.out.println(tm1.containsKey(5));

        System.out.println(tm1.replace(9, 90));
        System.out.println(tm1.replace(9, 90, 100));
        System.out.println(tm1);
        
        System.out.println("----------------------------------------------------------------");

        TreeMap<String, List<String>> map = new TreeMap<>();

        List<String> l1 = Arrays.asList("Bangalore", "Kolkata", "Hyd");
        List<String> l2 = Arrays.asList("J&K", "Assam", "Mizoram");
        List<String> l3 = Arrays.asList("Hubli", "Dharwad", "Bhilwara");

        map.put("SBI", l1);
        map.put("ICICI", l2);
        map.put("Federal", l3);

        System.out.println(map);

        System.out.println("--------- Iterating map with entrySet() ---------");
        Set<Entry<String, List<String>>> bankSet = map.entrySet();
        for (Entry<String, List<String>> entry : bankSet) {
            System.out.println(entry.getKey() + " ---> " + entry.getValue());
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");

        TreeMap<Integer, String> tm2 = new TreeMap<>();
        tm2.put(2, "Hello");
        tm2.put(9, "Ram");
        tm2.put(5, "d");
        System.out.println(tm2);
        System.out.println(tm2.containsKey(5));

        System.out.println(tm2.replace(9, "hi"));
        System.out.println(tm2.replace(9, "hi", "hello"));
        System.out.println(tm2);

        Set<Integer> set = tm2.keySet();
        Iterator<Integer> itr1 = set.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        System.out.println("----------------------------------------------");

        Collection<String> c = tm2.values();
        Iterator<String> itr2 = c.iterator(); 
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println("-----------------------------------------------");

        Set<Entry<Integer, String>> s = tm2.entrySet();
        Iterator<Entry<Integer, String>> itr3 = s.iterator(); 
        while (itr3.hasNext()) {
            System.out.println(itr3.next());
        }
        System.out.println();

        for (Entry<Integer, String> e : s) {
            System.out.println(e.getKey() + "---->" + e.getValue());
        }
    }
}
