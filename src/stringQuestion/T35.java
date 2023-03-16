package stringQuestion;

public class T35 {

	public static void main(String[] args) {
		// 35.	Write a Java program to replace all occurrences of a character with another in a string.
		String s="ritu jadhav";
		int n=0;
		char ch='a';
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==ch)
			{
				System.out.print("Q");
			}
			else
			{
				System.out.print(s.charAt(i));
			}
			
		}
	}

}
