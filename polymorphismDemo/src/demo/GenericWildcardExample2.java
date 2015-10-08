package demo;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcardExample2 {

	public static void main(String[] args) {
		List<Dog> kennel = new ArrayList<Dog>();
		kennel.add( new Dog() );
		kennel.add( new Dog() );

		List<? extends Animal> objs = kennel;
//		objs.add( new Cat() );
		
		for (Animal o: objs) {
			o.speak();
		}
// However, it would be a compilation error to try to
// add new objects to the list through objs. We don't know
// what type of objects the List contains. They might be
// all Dogs, or all Cats, or all "generic" Animals.
	}

}
