package ArrayList;

import java.util.ArrayList;

public class IncreaseCapacity {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("RED");
		ar.add("Green");
		ar.add("BLUE");
		
		
		ar.ensureCapacity(2);
		ar.add("BIKE");
		ar.add("CAR");
		ar.add("BUS");
		System.out.println(ar);
		
		
	}
}
