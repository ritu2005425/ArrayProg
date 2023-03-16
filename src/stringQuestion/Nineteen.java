package stringQuestion;

public class Nineteen {

	public static void main(String[] args) {
		// 19.	Write a Java program to trim trailing white space characters in a string.
		
		String s="I am good girl   ";
		char ch[]=new char[20];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				ch[i]=s.charAt(i);
				System.out.print(ch[i]);
			}
		}
		String str=new String(ch);
		System.out.println(str);
				

	}

}
