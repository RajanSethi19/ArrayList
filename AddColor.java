package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AddColor {

	public static void main(String[] args) {
		ArrayList ar = new ArrayList();
		ar.add("RED");
		ar.add("Green");
		ar.add("BLUE");
		ar.add("BROWN");
		ar.add("YELLOW");
		ar.add("PINK");
		
		System.out.println(ar);
		List<String> sub= ar.subList(0, 3);
		System.out.println(sub);
		
		
		
		

		// Collections.shuffle(ar);
	}

}
