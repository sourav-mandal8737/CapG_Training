package Methods;

public class AccessMethod {
	public static void main(String[] args) {
		System.out.println("main start from access method class");
		Method.message();
		System.out.println("main end from access mehod");
	}
	static void message() {
		System.out.println("hi");
	}

}
