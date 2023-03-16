package stringQuestion;

public class T39 {

	public static void main(String[] args) {
		// 39.	Write a Java program to remove first occurrence of a word from string.
		
		String s="ritu ramesh jadhav ritu";
		String[] arr=s.split(" ");
		String rt="ritu";
		int n=s.indexOf(rt);
		for(int i=0;i<arr.length;i++)
		{
			if(n!=i)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
