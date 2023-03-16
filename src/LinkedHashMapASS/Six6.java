package LinkedHashMapASS;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Six6 {

	public static void main(String[] args) {
//		6. An arraylist has strings "A+2" , "B+12" , "D+4", "DD+5" and so on. Create 
//		a map which has alphabets as keys and integers as values. If alphabet is 
//		repeated add integer to old value

		ArrayList<String> list=new ArrayList<String>();
		list.add("A+2");
		list.add("B+12");
		list.add("D+4");
		list.add("DD+5");
		ArrayList<String> alpha=new ArrayList<String>();
		ArrayList<Integer> intval=new ArrayList<Integer>();
		for(String s:list)
		{
			String ch=s.substring(0,s.indexOf("+"));
			alpha.add(ch);
			String val=s.substring(s.indexOf("+")+1);
			//convert String to integer(primitives)
			int i=Integer.parseInt(val);
			intval.add(i);
			
		}
		
	//	System.out.println(list);
		LinkedHashMap<ArrayList<String>,ArrayList<Integer>> map=new LinkedHashMap<ArrayList<String>,ArrayList<Integer>>();
		map.put(alpha, intval);
		System.out.println(map);
		
	}

}
