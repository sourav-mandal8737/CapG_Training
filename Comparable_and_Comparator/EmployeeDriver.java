package Comparable_and_Comparator;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ram", 28000);
        Employee e2 = new Employee(2, "Raj", 30000);

        compareBasedOnName(e1, e2);

        compareBasedOnId(e1, e2);

        compareBasedOnSalary(e1, e2);
    }

    public static void compareBasedOnName(Employee e1, Employee e2) {
        if (e1.compareTo(e2) > 0) {
            System.out.println("e1's name is greater");
        } else if (e1.compareTo(e2) < 0) {
            System.out.println("e2's name is greater");
        } else {
            System.out.println("e1 and e2 have the same name");
        }
    }

    // Comparing based on ID
    public static void compareBasedOnId(Employee e1, Employee e2) {
        CompareEmployeeById compareById = new CompareEmployeeById();
        if (compareById.compare(e1, e2) > 0) {
            System.out.println("e1's ID is greater");
        } else if (compareById.compare(e1, e2) < 0) {
            System.out.println("e2's ID is greater");
        } else {
            System.out.println("e1 and e2 have the same ID");
        }
    }

    // Comparing based on Salary
    public static void compareBasedOnSalary(Employee e1, Employee e2) {
        CompareEmployeeBySalary compareBySalary = new CompareEmployeeBySalary();
        if (compareBySalary.compare(e1, e2) > 0) {
            System.out.println("e1's salary is greater");
        } else if (compareBySalary.compare(e1, e2) < 0) {
            System.out.println("e2's salary is greater");
        } else {
            System.out.println("e1 and e2 have the same salary");
        }
    }
}
