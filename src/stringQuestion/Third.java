package stringQuestion;

public class Third {

	public static void main(String[] args) {
		// 3.	Compare string using new operator when new is present see different reference is there.
		String s=new String("ritu");
		String s2=new String("reva");
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
