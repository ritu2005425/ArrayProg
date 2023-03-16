package stringQuestion;

public class TwentyTwo {

	public static void main(String[] args) {
		// 22.	Write a Java program to toggle case of each character of a string.
		
		String s="I aM doing coding";
		char ch[]=new char[20];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)<90 && s.charAt(i)>=65)  
			{
				ch[i]=(char) (s.charAt(i)+32);
			}
			else
			{
				ch[i]=(char) (s.charAt(i)-32);
			}
		}
		String st=new String(ch);
		System.out.println(st);

	}

}
