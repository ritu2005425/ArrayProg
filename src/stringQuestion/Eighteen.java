package stringQuestion;

public class Eighteen {

	public static void main(String[] args) {
		// 18.	Write a Java program to remove all occurrences of a character from string.
		
		String s=" i am good to go";
		String s2= s.trim();
		char arr[] = new char[20];
		char ch='o';
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)!=ch)
			{
				arr[i]=s2.charAt(i);
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	
		String string = new String(arr); 
		System.out.println(string);
	}

}
