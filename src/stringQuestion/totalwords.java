package stringQuestion;

public class totalwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="ritu ramehs anknas";
		String[] arr=s.split(" ");
		int c=0;
		for(String t:arr)
		{
			c++;
		}
		System.out.println(c);
	}

}
