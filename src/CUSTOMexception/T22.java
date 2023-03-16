package CUSTOMexception;

public class T22 {

	//22. WAP to create user defined Exception and catch the exception
	public static void main(String[] args) {
	validate();
}
	
	public static void validate()
	{
		int age=19;	
		try
		{
			if(age>20)
			{
				System.out.println("He is adult");
			}
			else
			{
				throw new invalidException("He is younger");
			}
		}
		catch(invalidException e)
		{
			System.out.println(e);
		}
	}

}
