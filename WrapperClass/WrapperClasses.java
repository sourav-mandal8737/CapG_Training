package WrapperClass;

public class WrapperClasses {    
	public static void main(String[] args) {
		int i=10;
		double d=10.5;
		Integer x=new Integer(i);
		Double r=new Double(d);
		System.out.println("x: "+x);  //boxing
		System.out.println("r: "+r);
		
		
	    Integer z=Integer.valueOf(i);	
		Double p=Double.valueOf(d);
	    System.out.println("z: "+z);
		System.out.println("p: "+p); 
		
		
		
		Integer y=i;
		Double q=d;
		System.out.println("q: "+q);
		System.out.println("y: "+y); //auto-boxing
		
		int a=y.intValue(); //unboxing
		Boolean flag=true;
		boolean b=flag.booleanValue(); //unboxing
		System.out.println("a: "+a+" "+"b: "+b);
		
		
		Character ch='a';//auto-boxing
		char c=ch;//auto-unboxing
		
		
		Integer o=128;
		Integer j=128;
		System.out.println(o==j);//false
		
		
		//Parsing
		String s="true";
		Boolean l=Boolean.parseBoolean(s);
		System.out.println(l);
	}
}
