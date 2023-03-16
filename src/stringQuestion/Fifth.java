package stringQuestion;

public class Fifth {

	public static void main(String[] args) {
		// 6.	Write a Java program to concatenate two strings.
		
		String s="ritu";
		String s2="ritu";
		String s4=s.concat(s2);
		System.out.println("concatenated object "+s4);
//		7.	Write a Java program to compare two strings.
		if(s.equals(s2))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}

}
