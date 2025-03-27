package MethodOverriding;

public class Driver1 {
	public static void main(String[] args) {
		Animal dogAnimal=new Dog1("Siberian Husky");
		dogAnimal.sound();
		String dogBreed=((Dog1)dogAnimal).breed;
		System.out.println(dogBreed);
		dogAnimal.sound();
		Animal tiger=new Tiger();
		tiger.sound();
	}

}
