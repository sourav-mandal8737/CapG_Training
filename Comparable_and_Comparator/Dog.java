package Comparable_and_Comparator;

import java.util.Arrays;

public class Dog {
    String name;
    int age;
    String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + breed;
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Tommie", 5, "Husky");
        dogs[1] = new Dog("Gimmie", 10, "German Shepherd");
        dogs[2] = new Dog("Bennie", 7, "Labrador");

        Arrays.sort(dogs, new CompareBreed());

        for (Dog a : dogs) {
            System.out.println(a);
        }
    }
}
