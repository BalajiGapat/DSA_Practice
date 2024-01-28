package thread_using_lambda_expression;

public class MyThread
{
	public static void main(String[] args) throws InterruptedException
	{
		Thread t1=new Thread( ()-> {
			for(int i=1;i<=5;i++)
			{
				System.out.println("User Thread: "+i);
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(" main: "+i);
			Thread.sleep(4);
		}
		
	}
}
