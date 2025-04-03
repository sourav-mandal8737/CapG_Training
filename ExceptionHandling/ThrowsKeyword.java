package ExceptionHandling;

public class ThrowsKeyword {
	public static void main(String[] args) {
		//div(10,2);
	}
	public static void div(int x,int y) throws RuntimeException, ClassNotFoundException,Exception{
		System.out.println(x/y);
		Class.forName("demo");
	}

}
