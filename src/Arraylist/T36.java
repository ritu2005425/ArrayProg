package Arraylist;

import java.util.ArrayList;

public class T36 {

	public static void main(String[] args) {
		// 36. WAP to trim the capacity of an ArrayList the current list size
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: " + c1);
        System.out.println("Let trim to size the above array: ");
        c1.trimToSize();
        System.out.println(c1);
		

	}

}
