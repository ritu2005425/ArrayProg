package AssignmentCW;

public class minchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch= {'A','G','H','Y'};
		char max=ch[0];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>max)
			{
				max=ch[i];
			}
			
		}
		System.out.println(max);
		
	}

}
