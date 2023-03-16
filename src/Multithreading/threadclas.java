package Multithreading;

public class threadclas extends Thread {
	
	public void run()
	{
		System.out.println("i am running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadclas t=new threadclas();
	
		t.start();

		
	}

}
