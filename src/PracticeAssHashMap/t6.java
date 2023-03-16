package PracticeAssHashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class t6 {

public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list=new ArrayList<String>();
list.add("A+2");
list.add("B+12");
list.add("D+4");
list.add("DD+5");
System.out.println(list);
HashMap<String, Integer> map=new HashMap<String, Integer>();

for(int i=0;i<list.size();i++)
{
	String t=list.get(i);
	String sub=t.substring(0,t.indexOf("+"));
	String num=t.substring(t.indexOf("+")+1);
	Integer n=Integer.parseInt(num);
	map.put(sub, n);
}
System.out.println(map);
}
}
