package lv.olga;

import lv.olga.polymorphism.Animal;
import lv.olga.polymorphism.Cat;
import lv.olga.polymorphism.Dog;

public class TestPolyMorphism {


	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		animal.animalSound();
		myDog.animalSound();
		myCat.animalSound();

	}

}
