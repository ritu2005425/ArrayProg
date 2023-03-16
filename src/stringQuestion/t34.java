package stringQuestion;

public class t34 {

	public static void main(String[] args) {
		//34.	Write a Java program to replace last occurrence of a character with another in a string.
		String s="ritu jadhav";
		int n=s.lastIndexOf('a');
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
