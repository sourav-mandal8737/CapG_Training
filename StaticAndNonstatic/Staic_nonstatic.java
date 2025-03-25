package StaticAndNonstatic;

public class Staic_nonstatic {
	int id=1;
	static String name="Raj";
	public Staic_nonstatic() {
		System.out.println(id);
		System.out.println(name);
	}
    public static void main(String[] args) {
    	Staic_nonstatic s1=new Staic_nonstatic();
    	System.out.println(s1.name);
	}
}
