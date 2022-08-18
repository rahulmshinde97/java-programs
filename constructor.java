import java.lang.*;
class constrctor
{   

    Demo()
	{
		System.out.println("Default constructor");
	}
	
    
	Demo(int i,int j)
    {
	   System.out.println(" parameterized constructor ");
    }

    public static void main(String a[])
	{
	   Demo obj = new Demo(10,20);
	   Demo obj2 = new Demo();
		
	}
}		

