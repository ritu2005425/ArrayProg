package stringQuestion;

import java.util.Arrays;

public class T38 {

	public static void main(String[] args) {
		// 38.	Write a Java program to count occurrences of a word in a given string.
		
		String s="ritu ramesh jadhav ritu";
		String[] arr=s.split(" ");
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
				System.out.println(arr[i]+" "+c);
			}
		}
		

	}

}
