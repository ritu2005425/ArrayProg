package stringQuestion;

public class TwentyThird {

	public static void main(String[] args) {
		// 23.	Write a Java program to count total number of vowels and consonants in a string.

		String s2="i am ritu jadhav";
		String s=s2.toLowerCase();
		int c=0;
		int p=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				c++;
			}
			else
			{
				p++;
			}
			}
		}
		System.out.println("total number of voels is " +c);
		System.out.println("total number of consonants is " +p);
		
		
	}

}
