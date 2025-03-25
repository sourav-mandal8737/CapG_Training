package Oop;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.name+" "+s1.college_name+" "+s1.id);
		
		System.out.println("------------------------------------");
		Student s2=new Student(1,"Raj");
		System.out.println(s2.name+" "+s2.college_name+" "+s2.id);
		
		
		
		
		
		
		
		/*s1.name="Sourav";
		s1.college_name="IEM";
		s1.id=1;
		s1.marks=95.5;
		System.out.println(s1.college_name+" "+s1.id+" "+s1.marks+" "+s1.name);

		s1.study();
		System.out.println("------------------------------------");
		
		Student s2=new Student();
        s2.name="Ram";
        s2.id=2;
        s2.college_name="UEM";
        s2.marks=95.4;
		
		System.out.println(s2.college_name+" "+s2.id+" "+s2.marks+" "+s2.name);
		s2.study();*/
	}

}
