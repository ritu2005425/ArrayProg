package PracticeAssHashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class BNYmellon {


	public static void main(String[] args) {
//	[[2,5],[7,8],[4,7]];
	ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(2,5));
	ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(7,12));
	ArrayList<Integer> list4=new ArrayList<Integer>(Arrays.asList(10,20));
	ArrayList<List<Integer>> newlist=new ArrayList<>();
	newlist.add(list4);
	newlist.add(list2);
	newlist.add(list);
	System.out.println(newlist);
	HashMap<Integer, Integer> map=new HashMap<>();
	ArrayList<Integer> val=new ArrayList<>(Arrays.asList(1,4,5,6,7,8,9,10,11,12));
	for(Integer i:val)
	{
		int c=0;
		for(List<Integer> ilist:newlist)
		{
			if(i>ilist.get(0) && i<ilist.get(1))
			{
				c++;
			}
		}
		map.put(i, c);
	}
	System.out.println(map);
	

	}
}
