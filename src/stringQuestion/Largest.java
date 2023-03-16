package stringQuestion;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5.	WAP to find longest word in the given sentence
//		String s="ritu ramesh jadhaav";
//		String str[]=s.split(" ");
//		int n = 0;
//		String large = null;
//		for(int i=0;i<str.length;i++)
//		{
//			n=str[i].length();  
//			int max=str[0].length();
//			if(n>max)
//			{
//				max=n;
//				large=str[i];
//				
//				
//			}
//		}
//		System.out.println(n+" "+large);
		
		
		
		String s="rityuydyu ramesh jadhaaviiiiiiiiiiu";
		String str[]=s.split(" ");
		int max=str[0].length();
		String val=str[0];
		for(int i=0;i<str.length;i++)
		{
			if(str[i].length()>max)
			{
				max=str[i].length();
				val=str[i];
				System.out.println(val);
			}
		}
		System.out.println("largerst word is "+val+" "+max);
	}

}
