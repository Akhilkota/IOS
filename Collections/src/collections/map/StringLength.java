package collections.map;

import java.util.Comparator;

public class StringLength implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
	
		int i = o1.length();
		int j = o2.length();
		
		if(i==j){
			return 0;
		}
		else if (i>j){
			return 1;
		}
		else{
			return -1;
		}
	
	}
	
	
}
