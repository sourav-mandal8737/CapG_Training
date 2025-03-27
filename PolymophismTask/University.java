package PolymophismTask;

public class University {
    private Person[] people;
    private int count;

    public University() {
        people = new Person[5]; 
        count = 0;
    }

    public void addPerson(Person p) {
        if (count < people.length) {
            people[count++] = p;
        } else {
            System.out.println("University is full, cannot add more people.");
        }
    }

    public void showPeople() {
        for (int i = 0; i < count; i++) {
            people[i].displayInfo();
        }
    }
}