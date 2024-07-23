package ArrayList;

import java.util.ArrayList;

public class CompareTwoArrayList {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("RED");
		ar.add("Green");
		ar.add("BLUE");
		ar.add("BROWN");
	
		
		ArrayList ar1 = new ArrayList();
		ar1.add("RED");
		ar1.add("Green");
		ar1.add("BLUE");
		
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		for(String e:ar) {
			ar2.add(ar1.contains(e) ?  "YES": "N0");
			
			
			
		}
		System.out.println(ar2);

	}

}
