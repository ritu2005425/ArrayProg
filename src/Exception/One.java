package Exception;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			
		
		int arr[]=new int[4];
		arr[2]=4;
		System.out.println(arr[5]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
