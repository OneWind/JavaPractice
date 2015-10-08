package demo;

public class ArrayTypeError {

	public static void main(String[] args) {
		Dog[] kennel = {new Dog(), new Dog()};
		
		for (Dog d: kennel) d.speak();
		
//		Object[] things = kennel;
		Object[] things = new Object[2];
		things[0] = new Cat();
		things[1] = new Dog();
		
//		for (Object d: things) d.speak();
		
		for (Object d: things) {
			if (d.getClass() == demo.Cat.class) {
				Cat cat = (Cat) d;
				cat.speak();
			} else if (d.getClass() == demo.Dog.class) {
				Dog dog = (Dog) d;
				dog.speak();
			}
		}
	}

}
