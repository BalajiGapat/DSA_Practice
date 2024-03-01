package pkg1;

class  Parent 
{
	public String publicName;	
	protected String protectedName;
	String defaultName;
	private String privateName;
}

class Child extends Parent
{
	private int privateNum;
	public int publicNum;
	protected int protectedNum;
	String defaultNum;
}


public class ParentPrivateField 
{
	public static void main(String[] args)
	{
		Child obj=new Child();
	}
}
