package Comparable_and_Comparator;

import java.util.Comparator;

public class CompareBreed implements Comparator<Dog> {

    @Override
    public int compare(Dog d1, Dog d2) {
        // Sorting breed in descending order
        return d2.breed.compareTo(d1.breed);
    }
}
