package ArrayList;

import java.util.ArrayList;

public class CloneArrayList {

	public static void main(String[] args) {
		 ArrayList<String> c1= new ArrayList<String>();
         c1.add("Red");
         c1.add("Green");
         c1.add("Black");
         c1.add("White");
         c1.add("Pink");
         
         c1.trimToSize();
         System.out.println(c1);
         
         
			/*
			 * Object obj=c1.clone(); System.out.println(c1); System.out.println(obj);
			 */
        
	}

}
