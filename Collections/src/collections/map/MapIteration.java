package collections.map;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map <Integer , String> map = new HashMap <Integer , String>();
			map.put(5, "Five");
			map.put(4, "four");
			map.put(3, "three");
			map.put(6, "six");
			map.put(8, "eight");
			map.put(0, "zero");
			map.put(null, null);
			map.put(1, null);
			//map.put(null, "1");
			
			
			System.out.println("Iterating");
			
			for(Map.Entry<Integer, String> entry : map.entrySet()){
				System.out.print(entry.getKey());
				System.out.print(":");
				System.out.println(entry.getValue());
				
			}

	}

}
