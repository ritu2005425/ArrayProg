package stringQuestion;

public class TwentyFive {

	public static void main(String[] args) {
		// 25.	Write a Java program to reverse order of words in a given string.
		String s="hello mumbai";
		String str[]=s.split(" ");
		for(String val:str) //HELLO
		{
			for(int j=val.length()-1;j>=0;j--)
			{
				System.out.print(val.charAt(j));
			}
			System.out.print("\t");
		}
	
		//REVERSE PROGRAM
//		String s="riut";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			System.out.print(s.charAt(i));
//		}
		
	}

}



