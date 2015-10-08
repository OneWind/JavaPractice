package demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsWildcardExample3 {

	public static <T> void add1 (T obj, Collection<? super T> c) {
		c.add(obj);
	}

	public static <U, T extends U> void add2 (T obj, Collection<U> c) {
		c.add(obj);
	}
	
	public static void main(String[] args) {
		List<Animal> menagerie = new ArrayList<Animal>();
		
		menagerie.add( new Cat() );
		menagerie.add( new Dog() );
		
		add1(new Cat(), menagerie);
		add2(new Dog(), menagerie);
		
		for (Animal o: menagerie) {
			o.identify();
		}
		
	}

}
