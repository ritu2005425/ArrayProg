package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class thirty {

	public static void main(String[] args) {
		// WAP to sort a given ArrayList
		
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        c1.stream().sorted().forEach(e->System.out.print(" "+e));
        System.out.println(" ");
        c1.stream().sorted(Collections.reverseOrder()).forEach(e->System.out.print(" "+e));
        Collections.sort(c1);
        System.out.println(c1);

	}

}
