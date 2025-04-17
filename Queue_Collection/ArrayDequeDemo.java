
package Queue_Collection;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
	public static void main(String[] args) {
		
     ArrayDeque arr=new ArrayDeque();
     arr.add(10);
     arr.add(10.75);
     arr.add(10);
     arr.add("Hello");
     System.out.println(arr);
     
     System.out.println(arr.getFirst());
     System.out.println(arr.getLast());
	}
     
}
