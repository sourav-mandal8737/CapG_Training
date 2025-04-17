package Tree_Set;

import java.util.Comparator;
import java.util.TreeSet;

public class EmployeeDriver {
    public static void main(String[] args) {
        Comparator<Employee> nameDescComparator = (e1, e2) -> e2.name.compareTo(e1.name);

        TreeSet<Employee> employeeSet = new TreeSet<>(nameDescComparator);

        employeeSet.add(new Employee("Ram", 50000));
        employeeSet.add(new Employee("Rohan", 60000));
        employeeSet.add(new Employee("Raj", 55000));
        employeeSet.add(new Employee("Rohan", 70000)); 

        for (Employee emp : employeeSet) {
            System.out.println(emp);
        }
    }
}


