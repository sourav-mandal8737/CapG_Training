//code for sorting in ascending order by name or salary


/*package Tree_Set;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Name: " + name + ", Salary: $" + salary;
    }

    @Override
    public int compareTo(Employee other) {
        //return this.name.compareTo(other.name);
        return Double.compare(this.salary, other.salary);
    }
}*/




package Tree_Set;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Name: " + name + ", Salary: $" + salary;
    }
}











