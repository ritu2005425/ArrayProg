package Exception;

 class parent
{
	 public static void m1() throws Exception
		{
			System.out.println("hello");
		}
}

class child extends parent
{
	 public static void m1() throws Exception
		{
			System.out.println("Hi");
		}
}



public class S16 {
	
public static void main(String[] args) throws Exception{
		// 16. WAP to check Exception handling with method overriding. Means, If super class method don’t 
	//	declare exception then subclass overridden method can declare exception or not.
	child.m1();

	}

}
