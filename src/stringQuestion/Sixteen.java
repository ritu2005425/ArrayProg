package stringQuestion;

public class Sixteen {

	public static void main(String[] args) {
		// 16.	Write a Java program to search all occurrences of a character in given string.
 String s="My name is ritu.";
 char ch='i';
 for(int i=0;i<s.length();i++)
 {
	 if(s.charAt(i)==ch)
	 {
		 System.out.println(ch +" occurs at position "+i);
	 }
 }
	}

}
