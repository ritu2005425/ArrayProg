package stringQuestion;

public class t31 {

	public static void main(String[] args) {
//	/31.	Write a Java program to remove last occurrence of a character from string.
		String s="hello friend";
		int n= s.lastIndexOf("e");
		System.out.println(n);
		for(int i=0;i<s.length();i++)
		{
			if(n!=i)
			{
				System.out.print(s.charAt(i));
			}
		}
		

	}

}