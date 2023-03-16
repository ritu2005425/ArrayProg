package LinkedHashMapASS;

import java.util.HashMap;

public class getinmap {

	public static void main(String[] args) {
	
		HashMap<String, Integer> map = new HashMap<>();
		// Adding elements to the Map
        // using standard put() method
        map.put("vishal", 10);
        map.put("sachin", 30);
        map.put("vaibhav", 20);
 
        // Print size and content of the Map
        System.out.println("Size of map is:- "+ map.size());
 
        // Printing elements in object of Map
        System.out.println(map);
       
        if(map.containsKey("sachin"))
        {
        	int i=map.get("sachin");
        	 System.out.println(i);
        }
       
        
        

}
}