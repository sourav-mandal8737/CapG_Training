package Lambda_Expression;

public class Employee implements Comparable<Employee> {
	int id;
	public String name;
	
	Employee(int id, String name){
		this.id=id;
		this.name=name;
	}
	public String toString() {
		return id+" "+name;
	}
	@Override
	public int compareTo(Employee o) {

		return (int) (o.id-this.id);
	}

}
