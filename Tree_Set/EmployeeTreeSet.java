package Tree_Set;

import java.util.Iterator;
import java.util.TreeSet;

public class EmployeeTreeSet {
    public static void main(String[] args) {
        TreeSet<Employee1> ts = new TreeSet<>(new CompareEmployeeByName());

        ts.add(new Employee1(20000, "Rohit"));
        ts.add(new Employee1(60000, "Aditya"));
        ts.add(new Employee1(87777, "Raghu"));
        ts.add(new Employee1(89888, "Dhanish"));

        Iterator<Employee1> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
