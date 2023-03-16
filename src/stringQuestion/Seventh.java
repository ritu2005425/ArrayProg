package stringQuestion;

public class Seventh {

	public static void main(String[] args) 
	{
		// 10.	WAP to split string into 2 tokens where string is “HELLO$WORLD”
		String s1="HELLO$WORLD";
		String s[]=s1.split("\\$");
		
		for(String t:s)
		{
			System.out.println(t);
		}

	}
	

}
