package using_thread_class;

class MyThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("in MyThread Class: "+i);
		}
	}
}

public class MyClass
{
	public static void main(String[] args) throws InterruptedException 
	{

		MyThread t1=new MyThread();
		t1.start();
		
		for(int i=11;i<=15;i++)
		{
			System.out.println("in main method:=======>>> "+i);
		}
		
	}
}
