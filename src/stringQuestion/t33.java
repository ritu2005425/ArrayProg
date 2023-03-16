package stringQuestion;

public class t33 {

	public static void main(String[] args) {
		// 33.	Write a Java program to replace first occurrence of a character with another in a string.
		String s="ritu jadhav";
		int n=s.indexOf('a');
		for(int i=0;i<s.length();i++)
		{
			if(n==i)
			{
				System.out.println("Q");
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}

	}

}
