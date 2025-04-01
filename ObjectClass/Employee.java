package ObjectClass;

public class Employee {
	private String name;
	private int id;
	private double salary;
	public Employee(String name,int id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	
	/*public String toString() {
		return name+" "+id+" "+salary;
	}*/
	public boolean equals(Object o) {
		if(o instanceof Employee) {
		Employee e=(Employee)o;
		return this.id==e.id && this.salary==e.salary && this.name.equals(e.name);
	} return false;
	}
	
	public int hashCode() {
		return (int)(this.id+this.salary+this.name.hashCode());
	}
	
	/*public int hashCode() {
		return 1; //worst way of overriding
	}*/

}
