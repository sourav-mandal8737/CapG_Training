package Method_references;

public class Driver {
	public static void main(String[] args) {
		Demo1 d=System.out::println;
		d.print("Hello world");
		System.out.println("--------------------------");
		//referencing a non-static method to target functional interface
		Driver driver=new Driver();	
		Test t=driver::print;
		t.greet(5,"Welcome");
		System.out.println("--------------------------------------");
        //referencing a static method to target functional interface 
		Table table=Driver::printTable;
		table.printTable(5);
	}
	
	
	
	public void print(int number,String message) {
		for(int i=0;i<number;i++) {
			System.out.println(message);
		}
	}
	
	public static void printTable(int x) {
		for(int i=1;i<=x;i++) {
			System.out.println(i*x);
		}
	}

}
