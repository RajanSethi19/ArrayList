package ArrayList;

import java.util.ArrayList;

public class IndexSize {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("RED");
		ar.add("Green");
		ar.add("BLUE");
		
		
		int a= ar.size();
		
		for(int i=0;i<a;i++) {
			
		System.out.println(ar.get(i));	
		}
		
		

	}

}
