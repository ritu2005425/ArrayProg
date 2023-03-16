package PracticeHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class t13 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();
al.add("pune");
al.add("Mumbai");
al.add("pune");
al.add("Mumbai");
al.add("Nashik");
al.add("pune");

//System.out.println(al);
HashMap<String, Integer> newmap=new HashMap<String, Integer>();
String[] arr=new String[al.size()];
for(int z=0;z<al.size();z++)
{
	arr[z]=al.get(z);
}
for(int i=0;i<arr.length;i++)
{
	boolean flag=true;
	for(int k=i-1;k>=0;k--)
	{
		if(arr[i].equals(arr[k]))
		{
			flag=false;
		}
	}
	int c=1;
	if(flag)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i].equals(arr[j]))
			{
				c++;
			}
		}
		newmap.put(arr[i], c);
	}
}
System.out.println(newmap);
}
}
