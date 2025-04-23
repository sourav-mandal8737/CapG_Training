package Reflection_Api;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private int age;

    public Employee(int id, String name, double salary, int age) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    @Deprecated
    public String getName() {
        return name;
    }
    @Deprecated
    public double getSalary() {
        return salary;
    }
    @Deprecated
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + salary + " " + age;
    }
}
