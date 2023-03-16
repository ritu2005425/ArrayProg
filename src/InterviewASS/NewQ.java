package InterviewASS;

public class NewQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<20;i++)
		{
		if(i%3==0 && i%5!=0)
		{
			System.out.println("Three");
		}
		else if(i%5==0 && i%3!=0)
		{
			System.out.println("Five");
		}
		else if(i%3==0 && i%5==0)
		{
			System.out.println("Three-Five");
		}
		else
		{
			System.out.println(i);
		}
		

		}
	}

}
