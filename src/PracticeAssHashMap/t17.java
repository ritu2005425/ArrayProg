package PracticeAssHashMap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;

public class t17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<>();
		list.add("A+2");
		 list.add("B+12");
		 list.add("D+4");
		 list.add("DD+5");
		 TreeMap<String, Integer> map=new TreeMap<>(new mycomparator() );
		 for(int i=0;i<list.size();i++)
		 {
			 String t=list.get(i);
			 String s=t.substring(0,t.indexOf("+"));
			 String n=t.substring(t.indexOf("+")+1);
			 int r=Integer.parseInt(n);
			 map.put(s, r);
		 }
System.out.println(map);
	}

}
class mycomparator implements Comparator<Object>
{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		String s=o1.toString();
		String s2=o2.toString();
		return -s.compareTo(s2);
	}
	
}
