package stringQuestion;

import java.util.Arrays;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s[]= {"bjbjb","jbwf","iojoijq","jbhc","abc"};
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(" " +s[i]);
		}
	}

}
