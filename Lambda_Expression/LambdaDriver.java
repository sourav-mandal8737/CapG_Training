package Lambda_Expression;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDriver {
	public static void main(String[] args) {
		LamdaDemo d1=() -> System.out.println("Hello");	
	    Demo d2=() ->System.out.println("Hello");
	
	   d1.print();
	   d2.greet();
	    
	    Demo2 d3= (x,y)->{
	    	if(x>y) {
	    		return x;
	    	}
	    	else {
	    		return y;
	    	}
	    };
	    
	    System.out.println(d3.check(10, 20));
	    
	    //sorting list of integers in descending order using lambda expression
	    List<Integer> list=Arrays.asList(1,2,3,4,5);
	    System.out.println(list);
	    Comparator<Integer> comparator=(o1,o2) -> o2-o1;
	    Collections.sort(list,comparator);
	    System.out.println(list);
	    
	}

}
