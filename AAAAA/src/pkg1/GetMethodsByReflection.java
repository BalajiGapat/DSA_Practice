package pkg1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class Student
{
	private String name;
	
	public Student()
	{
		
	}
	
	public Student(String name)
	{
		this.name=name;
	}
	
	public void display()
	{
		System.out.println("In desplay method....");
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
	
}

public class GetMethodsByReflection 
{
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, SQLException 
	{
		Student stud=new Student();
//		Method[] m=stud.getClass().getMethods();
//		//System.out.println(Arrays.toString(m));
//		for(Method i:m)
//			System.out.println(i);
		
		System.out.println("==========================================================");
		
		Constructor<?>[] con=stud.getClass().getConstructors();
		for(Constructor<?> i:con)
			System.out.println(i);
		
		System.out.println("==========================================================");
		
		Class<?> c=Class.forName("pkg1.Student");
		Constructor<?> co=c.getConstructor(String.class);
		Student stud2=(Student) co.newInstance("Balaji");
		System.out.println(stud2);
		
		
	}	
}
