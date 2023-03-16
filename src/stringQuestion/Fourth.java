package stringQuestion;

public class Fourth {

	public static void main(String[] args) {
		// 5.	Write a Java program to find length of a string.
	
		String s="riut";
		System.out.println(s.length());
		int c=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			c++;
		}
		System.out.println(c);
		
	}

}
