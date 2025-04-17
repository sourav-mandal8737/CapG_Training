package Tree_Set;

public class Employee1 implements Comparable<Employee> {
    double salary;
    String name;

    Employee1(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public String toString() {
        return salary + " " + name;
    }

    @Override
    public int compareTo(Employee e) {
        return (int)(e.salary - this.salary);
    }
}
