package StringBuffer;

public class Buffer {
	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		sb1.append(false);
		sb1.append("Hi");
		System.out.println(sb1);
		StringBuffer sb2=new StringBuffer("Hello World");


		System.out.println(sb2);
		
		
		sb2.delete(0, 3);
		System.out.println(sb2);
		
		
		System.out.println("-------------------------------------------------------");
		char[] arr= {'a','p','p','l','e'};
		StringBuffer sb3=new StringBuffer(150);
		sb3.append(arr);
		System.out.println(sb3);
		System.out.println(sb3.capacity());
		sb3.ensureCapacity(151);
		System.out.println(sb3.capacity());
		
		sb3.insert(1, true);
		
		System.out.println(sb3);
		
		sb3.insert(4,arr,1,2);
		
		System.out.println(sb3);
		
		System.out.println(sb3.reverse());

		sb2.setCharAt(2,'f');
		System.out.println(sb2);
	}

}
