package using_runnable_interface;

class MyRunnable implements Runnable 
{
	@Override
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("in MyRunnable: "+i);
		}
	}
}


public class MyClass 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Thread t1=new Thread( new MyRunnable() );
		t1.start();
		Thread.sleep(10);
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("in main Method:===========>>"+i);
		}
	}
}
