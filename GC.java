import java.lang.*;
class Demo
{
	public int Arr[];
	public Demo(int size)
	{
		System.out.println("Allocatoin the resources");
		this.Arr = new int[size];
		
	}
	protected void finalize()
	{
		System.out.println("deallocation the resource");
		this.Arr = null;
		
	}
}
class GC
{
	public static void main(String arg[])
	{
		Demo dobj = new Demo(10);
		dobj = null;
		System.gc();
		System.out.println("End of main");
	}
}