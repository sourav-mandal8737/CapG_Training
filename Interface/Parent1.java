package Interface;

public class Parent1 {
	String name;
	int age;
	public Parent1(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	public Parent1(String name) {
		this.name=name;
	}
	
	public Parent1() {
		System.out.println("parent");
	}

}



