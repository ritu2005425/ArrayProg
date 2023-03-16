package stringQuestion;

public class Fourteen {

	public static void main(String[] args) {
		// 14.	Write a Java program to count total number of words in a string.
		String s="heelo my name is ritu tina is ";
		int c=0;
		String str[]=s.split(" ");
		for(String f:str)
		{
			c++;
		}
System.out.println("total number of words in string "+c);
	}

}
