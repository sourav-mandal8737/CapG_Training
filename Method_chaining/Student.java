package Method_chaining;

public class Student {
	String name;
	int id;
	
	public Student setName(String name) {
		this.name=name;
		//Student s=new Student();
		//return s;
		return this;
	}
	
	public Student setId(int id) {
		this.id=id;
		return this;
	}
	
	public void display() {
		System.out.println(this.name+" "+this.id);
	}

}
