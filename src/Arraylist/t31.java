package Arraylist;

import java.util.ArrayList;

public class t31 {

	public static void main(String[] args) {
		// 31. WAP to copy one ArrayList into another
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2= new ArrayList<String>(c1);
        
       System.out.println(c2);

	}

}
