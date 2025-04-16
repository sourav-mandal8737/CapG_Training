package Lists;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}

	
	public String toString() {
		return id+" "+name;
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id-o.id ;
	}
}
