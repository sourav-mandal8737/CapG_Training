package April_13th_Generics;

public class Employee<T>{
    T data1;
    T data2;

    public Employee(T data1, T data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    @Override
    public String toString() {
        return data1+" "+data2;
    }

    public static <T> void print(T[] arr) {
        for(T i: arr)
            System.out.print(i+" ");
    }

    // Main method
    public static void main(String[] args) {
        Employee<Integer> e1 = new Employee<Integer>(10,20);
        System.out.println(e1);
        System.out.println(e1.data1+e1.data2);

        Integer[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"Hello","World"};

        print(arr1);
        System.out.println();
        print(arr2);
    }
}
