package singleton;

public class Singleton 
{
	// Private static instance variable
	private static Singleton obj;
	
	// private constructor
	private Singleton()
	{
		
	}
	
	// Static method to get the singleton instance
	public static Singleton getObj()
	{
		if(obj==null)
			obj=new Singleton();
		return obj;
	}
}
