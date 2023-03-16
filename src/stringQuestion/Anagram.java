package stringQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
//		
//	String s1="ritu qramesh jadhav";
//	String s2="jadhav ramesh ritu";
//	String s4=s1.replaceAll("\\s","");
//	String s5=s2.replaceAll("\\s","");
//	char[] ch1=s4.toCharArray();
//	char[] ch2=s5.toCharArray();
//	Arrays.sort(ch1);
//	Arrays.sort(ch2);
//	if(Arrays.equals(ch1, ch2))
//	{
//		System.out.println("its an anagram");
//	}
//	else
//	{
//		System.out.println("not anaaream");
//	}
//		
		String s="ritu";
		String s1="tiiur";
		
	String s4=	s.replaceAll("\\s", "");
	String s5=	s1.replaceAll("\\s", "");
	boolean status=true;
	if(s4.length()!=s5.length())
	{
			status=false;
	}
	else
	{
		char[] ch=s4.toLowerCase().toCharArray();
		char[] ch2=s5.toLowerCase().toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch2);
		status=Arrays.equals(ch, ch2);
	}
	if(status)
	{
		System.out.println("words are anagram");
	}
	else
	{
		System.out.println("words are not anagram");
	}
		

	}
		


}
