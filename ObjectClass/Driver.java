package ObjectClass;

public class Driver {
	public static void main(String[] args) {
		Employee e1=new Employee("Ram",1,2000);
		//System.out.println(e);
		Employee e2=new Employee("Ram",1,2000);
        System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		String s="Ram";
		System.out.println(s.hashCode());
	}

}
