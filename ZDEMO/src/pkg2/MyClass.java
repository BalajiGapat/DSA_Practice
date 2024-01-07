package pkg2;

public class MyClass implements MyInterface
{
	@Override
	public void Ifunction() 
	{
		System.out.println("in fun...");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("in main...");
		MyClass obj=new MyClass();
		obj.Ifunction();
	}

}
