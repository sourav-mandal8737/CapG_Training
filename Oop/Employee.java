package Oop;

public class Employee {
	int id;
	String name;
	String companyName;
	double salary;
	
	
	public Employee() {
		System.out.println("No arg");
	}
	
	public Employee(int id) {
		this.id=id;
		System.out.println("One arg");
	}
	
	public Employee(int id,String name) {
		this(id);
		this.name=name;
		System.out.println("two arg");
	}
	
	public Employee(int id, String name, String companyName) {
		this(id,name);
		this.companyName=companyName;
		System.out.println("three arg");
	}
	
	public Employee(int id, String name, String companyName, double salary) {
		this(id,name,companyName);
		this.salary=salary;
		System.out.println("three arg");
	}

}
