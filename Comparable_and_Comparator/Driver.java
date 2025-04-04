package Comparable_and_Comparator;

public class Driver {
    public static void main(String[] args) {
        Person person1 = new Person("Ram", 30);
        Person person2 = new Person("Raj", 30);
        Person person3 = new Person("Raj", 25);
        Person person4 = new Person("Ram", 25);

        System.out.println("Comparing person1 and person2:");
        printComparisonResult(person1, person2);  

        System.out.println("\nComparing person1 and person3:");
        printComparisonResult(person1, person3); 

        System.out.println("\nComparing person1 and person4:");
        printComparisonResult(person1, person4);  

        System.out.println("\nDetails of Persons:");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
    }

    public static void printComparisonResult(Person p1, Person p2) {
        int result = p1.compareTo(p2);
        if (result > 0) {
            System.out.println(p1.name + " is greater than " + p2.name);
        } else if (result < 0) {
            System.out.println(p1.name + " is less than " + p2.name);
        } else {
            System.out.println(p1.name + " is equal to " + p2.name);
        }
    }
}
