package Linked_List;

import java.util.Comparator;

class MarksComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.marks, s2.marks); 
    }
}