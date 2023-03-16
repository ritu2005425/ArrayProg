package PracticArrayList;

import java.util.ArrayList;

public class t10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> bags = new ArrayList<String>();
		  
        // Add values in the bags list.
        bags.add("pen");
        bags.add("pencil");
        bags.add("paper");
        System.out.println(bags);
        // Creating another array list
        ArrayList<String> boxes = new ArrayList<String>();
  
        // Add values in the boxes list.
        boxes.add("pen");
        boxes.add("paper");
        boxes.add("books");
        boxes.add("rubber");
        
        System.out.println(boxes);
        
        boxes.retainAll(bags) ;
        System.out.println(boxes);
	}

}
