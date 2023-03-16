package stringQuestion;

import java.util.Arrays;
import java.util.Collections;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.	String create with new operator and without new
		
		String s="ritu";
		int j=0;
		String s1=new String("Jadhav");
		System.out.println("With string literal "+s);
		System.out.println("With new keyword "+s1);
		
		
		String arr=new String("ritu"); 
		char[] ch2=arr.toCharArray();
		for(int i=ch2.length-1;i>=0;i--)
		{
			System.out.print(ch2[i]);
		}
		String sr=new String(ch2);
		System.out.println(sr);
		
		char ch[]=new char[arr.length()];
		for(int i=arr.length()-1;i>=0;i--)
		{
			ch[j]=arr.charAt(i);
			j++;
		//	System.out.print(ch[j]);
		}
		String ne=new String(ch);
		System.out.println(ne);
		System.out.println(ne.length());
	}

}
