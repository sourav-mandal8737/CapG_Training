package Oop;

public class Student {
	/*int id=1;
	String name="Sourav";
	String college_name="IEM";
	double marks=95.5;
	
	public Student() {   //constructor
		System.out.println("This is a no arg constructor");
	}*/
	int id;
	String name;
	String college_name;
	double marks;
	
	public Student() {   //constructor
		System.out.println("This is a no arg constructor");
	}
	
	public Student (int id) {
		this.id=id;
		System.out.println("one arg constructor");
	}
	
	public Student(int id,String name) {
		//this.id=id;
		this(id);
		this.name=name;
		System.out.println("two arg constructor");

	}
	
	public Student(int id,String name,String college_name) {
		//this.id=id;
		//this.name=name;
		this(id,name);
	    this.college_name=college_name;
		System.out.println("three arg constructor");

	}
	public Student(int id, String name, String college_name,double marks) {

	     //this.id=id;
	     //this.name=name;
	     //this.college_name=college_name;
	     this(id,name,college_name); 
		 this.marks=marks;
		 System.out.println("four arg constructor");

	}
	public void study() {
		System.out.println(name+" is studying");
	}

}
