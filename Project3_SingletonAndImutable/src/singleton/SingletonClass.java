package singleton;

public class SingletonClass 
{
    private int sId;
    private String sName;
    private String city;
    private long mobile;

    // Private static instance variable
    private static SingletonClass stud;

    // Private constructor
    private SingletonClass() 
    {
    }

    // Static method to get the singleton instance
    public static SingletonClass getStud() 
    {
        if (stud == null) 
        {
            stud = new SingletonClass();
        }
        return stud;
    }

    // Setter method to update fields
    public void setStud(int sId, String sName, String city, long mobile) 
    {
        this.sId = sId;
        this.sName = sName;
        this.city = city;
        this.mobile = mobile;
    }

    @Override
    public String toString() 
    {
        return "SingletonClass [sId=" + sId + ", sName=" + sName + ", city=" + city + ", mobile=" + mobile + "]";
    }
}
