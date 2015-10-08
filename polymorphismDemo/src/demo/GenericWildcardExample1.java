package demo;
import java.util.List;
import java.util.ArrayList;

public class GenericWildcardExample1 {

	public static void main(String[] args) {
		List<Dog> kennel = new ArrayList<Dog>();
		kennel.add( new Dog() );
		kennel.add( new Dog() );

		List<?> objs = kennel;
//		objs.add( new Cat() );
		
		for (Object o: objs) {
			if (o.getClass() == demo.Cat.class) {
				Cat cat = (Cat) o;
				cat.speak();
			} else if (o.getClass() == demo.Dog.class) {
				Dog dog = (Dog) o;
				dog.speak();
			}			
		}
	}
}
