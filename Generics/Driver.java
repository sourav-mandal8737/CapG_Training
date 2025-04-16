package April_13th_Generics;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Student<Person> student = new Student<Person>(new Person(10,"Rohit"));
        printDetails(student);

        List<Boolean> list = new ArrayList<Boolean>();
        list.add(true);
        list.add(false);
        list.add(true);
        list.add(true);

        // Here, we are getting error since Boolean is not a subclass of Number class.
        //print(list);
        List<Object> ls = new ArrayList<Object>();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.add(50);

        printData(ls);
    }

    public static void printDetails(Student<? extends Person> student) {
        Person p = student.obj;
        System.out.println(p);
    }

    public static void print(List<? extends Number> list) {
        // here , we are getting an error since list is read only object.
        //list.add(true);
        System.out.println(list.get(0));
    }

    public static void printData(List<? super Integer> list) {
        // here , we are getting an error since list is read only object.
        list.add(10);
        System.out.println(list.get(0));
    }
}
