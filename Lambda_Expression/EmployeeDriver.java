package Lambda_Expression;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Lists.Employee;

public class EmployeeDriver {
	public static void main(String[] args) {
    //ArrayList <Employee>employee=new ArrayList<Employee>();
	   
    
        Employee e1=new Employee(3,"Rohit");
        Employee e2=new Employee(3,"Ram");
        Employee e3=new Employee(1,"Raj");
     
        List<Employee>employee=Arrays.asList(e1,e2,e3);
    
		//employee.add(new Employee(10,"Mohan"));
		//employee.add(new Employee(1,"Gobinda"));
		//employee.add(new Employee(3,"Murari"));	
		// lambda expression
		//Comparator<Employee> c=(o1,o2)->((Employee)o1).name.compareTo(((Employee)o2).name);
		Comparator<Employee> c=(o1,o2) -> o1.id-o2.id;
		Collections.sort(employee,c);
		System.out.println(employee);
		
	}

}


