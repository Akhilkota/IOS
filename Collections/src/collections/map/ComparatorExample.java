package collections.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ComparatorExample {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> animals = new ArrayList<>();
		
		animals.add("Dog");
		animals.add("Dogadf");
		animals.add("Dosadfg");
		animals.add("Dogdd");
		animals.add("Dogdg");
		animals.add("Doghjdfgdsfg");
		
		Collections.sort(animals,new StringLength());
		
		for(String name : animals){
			System.out.println(name);
		}
	}

}
