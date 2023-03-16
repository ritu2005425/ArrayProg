package Arraylist;

import java.util.ArrayList;

public class T33 {

	public static void main(String[] args) {
		// 33. WAP to join two ArrayLists
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("White");
        c2.add("Pink");
        c2.add("yellow");

       c1.addAll(c2);
       System.out.println(c1);

	}

}
