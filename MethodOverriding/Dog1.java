package MethodOverriding;

public class Dog1 extends Animal {
	
	String breed;  //variable which belongs to dog class only
	public Dog1(String breed) {
		this.breed=breed;
	}
	public void sound() { //method overriding
		System.out.println("Dog is barking");
	}

}
