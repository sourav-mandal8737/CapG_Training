package Method_chaining;

public class StudentDriver {
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s);
		System.out.println(s.setName("Rohit"));
		s.setId(1).setName("Rohit").display();
	}

}
