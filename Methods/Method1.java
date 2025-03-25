package Methods;

public class Method1 {
	public static void main (String[] args) {
		printing();
		printHello();
		add();
	}
	public static void printing() {
		System.out.println("Hi");
		System.out.println("Hello");
	}
	public static void printHello() {
		int i=0;
		while(i<5) {
			System.out.println("Hello");
			i++;
		}
	}
	public static void add() {
		System.out.println(15+16);
	}

}
