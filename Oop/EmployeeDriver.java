package Oop;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1=new Employee();
		System.out.println(e1.id+" "+e1.name);
	    System.out.println("-----------------------------------");
	
	    Employee e2=new Employee(1,"Rohan","abc");
	    System.out.println(e2.id+" "+e2.name+" "+e2.companyName);
	}

}
