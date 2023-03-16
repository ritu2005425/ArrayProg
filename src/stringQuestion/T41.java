package stringQuestion;

public class T41 {

	public static void main(String[] args) {
		// 41.	Write a Java program to remove all occurrence of a word in given string.
		String s="ritu jadhav ritu hello";
		System.out.println(s);
		String str[]=s.split(" ");
		String val="ritu";
		
		int n=s.indexOf(val);
		System.out.println(n);
		for(int i=0;i<str.length;i++)
		{
			if(!str[i].equals("ritu"))
			{
				System.out.println(str[i]);
			}
		}
		
		
	}

}
