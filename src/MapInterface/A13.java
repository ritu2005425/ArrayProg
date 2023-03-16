package MapInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("pune");
		list.add("mumbai");
		list.add("chennai");
		list.add("pune");
		list.add("pune");
		list.add("mumbai");
		
		String arr[]=new String[list.size()];
		for(int z=0;z<list.size();z++)
		{
			arr[z]=list.get(z);
		}
		System.out.println(Arrays.toString(arr));
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		
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
					if(arr[i].equals(arr[j])) {
						
						c++;
					}
				}
				map.put(arr[i], c);
			}
			
		}
		for(Map.Entry<String,Integer> m1:map.entrySet())
		{
		System.out.println(m1.getKey()+" "+m1.getValue());
		}
	}

}
