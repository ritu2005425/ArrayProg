package stringQuestion;

public class Thirty {

	public static void main(String[] args) {
		// 30.	Write a Java program to remove first occurrence of a character from string.
		
		String s="i am ritu";
		char ch='t';
		for(int i=0;i<s.length();i++)
		{
		int n=	s.indexOf(ch);
		if(n!=i)
		{
			System.out.print(s.charAt(i));
		}
		}
		
	 }

	

}
