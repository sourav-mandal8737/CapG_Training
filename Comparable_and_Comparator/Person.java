package Comparable_and_Comparator;


public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person other) {
        int nameComparison = this.name.compareToIgnoreCase(other.name);

        if (nameComparison != 0) {
            return nameComparison;
        }

        if (this.age < other.age) {
            return -1; 
        } else if (this.age > other.age) {
            return 1; 
        } else {
            return 0; 
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
