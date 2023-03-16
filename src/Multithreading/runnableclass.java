package Multithreading;

public class runnableclass implements Runnable{
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("this is runnable");
	}
	public static void main(String[] args) {
		runnableclass r=new runnableclass();
		Thread t =new Thread(r);
		t.start();

	}
}
