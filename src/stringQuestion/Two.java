package stringQuestion;

public class Two {

	public static void main(String[] args) {
		// 2.	Compare string using == when we create without new see same reference is there

		String s="ritu";
		String s2="reva";
		if(s==s2)
		{
			System.out.println("pointing to same object");
		}
		else
		{
			System.out.println("pointing to differnt object");
		}
	}

}
