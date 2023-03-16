package Arraypro;

public class seven7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {23, 43, 25, 49, 12, 9, 78, 66, 39};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<100;j++)
			{
				if(arr[i]==j*j)
				{
					System.out.println(arr[i]);
				}
			}
		}
	}

}
