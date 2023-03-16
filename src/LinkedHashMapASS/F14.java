package LinkedHashMapASS;

import java.util.SortedMap;
import java.util.TreeMap;

public class F14 {
public static void main(String[] args) {
//		14. Create TreeMap with month number as key and month name as value. 
//		Means it should contain entries like { 1=January,2=February....
//		From this treemap get portion of Map whose month numbers are between 3 
//		to 7 including both 3 and 7.
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		SortedMap<Integer,String> sortmap=new TreeMap<Integer,String>();
		map.put(7, "july");
		map.put(6, "june");
		map.put(1, "januaryy");
		map.put(2, "February");
		map.put(3, "March");
		map.put(4, "April");
		map.put(5, "May");
		map.put(8, "August");
		map.put(9, "September");
		map.put(10, "October");
		map.put(11, "November");
		map.put(12, "December");
		System.out.println(map);
		sortmap=map.subMap(3, 8);
		System.out.println(sortmap);

	}

}
