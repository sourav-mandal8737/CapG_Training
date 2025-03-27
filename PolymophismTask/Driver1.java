
package PolymophismTask;

public class Driver1 {
    public static void main(String[] args) {
        University university = new University();

        university.addPerson(new Student("Ram", 20, 101));
        university.addPerson(new Student("Raj", 22, 102));
        university.addPerson(new Professor("Vashkar Dey", 45, "Computer Science"));
        university.addPerson(new Professor("Palash Ghosh", 50, "Mathematics"));

        university.showPeople();
    }
}






