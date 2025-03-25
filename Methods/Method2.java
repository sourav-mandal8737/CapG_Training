package Methods;

/*public class Method2 {
	static int sum;
	public static void main(String[] args) {
		add(10,20);
		
	}
	// methods with no arg and no return type
	public static void message() {
		System.out.println("Hello");
	}
	// methods with no arg but has a return type
	public static int add() {
		int a=10;
		int b=20;
		return a+b;
	}
	// method with arg but no return type
	public static void add(int num1,int num2) {
		sum=num1+num2;
	}
	
	public static double add(int num1, double num2) {
		double res=num1+num2;
		return res;
	}

}*/




import java.util.Scanner;

public class Method2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the key: ");
        int key = sc.nextInt();

        search(array, key); 
        sc.close();
    }
    
    public static void search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Key found");
                return; 
            }
        }
        System.out.println("Key not found");
    }

}



