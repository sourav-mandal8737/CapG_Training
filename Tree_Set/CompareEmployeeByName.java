package Tree_Set;

import java.util.Comparator;

public class CompareEmployeeByName implements Comparator<Employee1> {
    public int compare(Employee1 e1, Employee1 e2) {
        return e2.name.compareTo(e1.name);
    }
}

