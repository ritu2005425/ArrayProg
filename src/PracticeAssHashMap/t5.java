package PracticeAssHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class t5 {

	public static void main(String[] args) {
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		System.out.println("enter string value");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("entered string is "+ s);
		
		for(int i=0;i<s.length();i++)
		{
			boolean flag=true;
			for(int k=i-1;k>=0;k--)
			{
				if(s.charAt(i)==s.charAt(k))
				{
					flag=false;
				}
			}
			int c=1;
			if(flag==true)
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(s.charAt(i)==s.charAt(j))
					{
						c++;
					}
				}
				if(s.charAt(i)!=' ')
				{
					map.put(s.charAt(i), c);
				}
				
			}
		}
		System.out.println(map);
		
		// TODO Auto-generated method stub

	}

}
