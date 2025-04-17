package HashSet_Collection;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(10.5);
		set.add("Hello");
		set.add(true);
		set.add(null);
		set.add(10.5);
		set.add(5);
		set.add(20);
		System.out.println(set);
		
	}

}
