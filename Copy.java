import java.lang.*;
class Employee
{
	public int EID;
	public String Ename;
	public int Esalary;
	
	public Employee(int id,String str,int no)
	{
		this.EID = id;
		this.Ename = str;
		this.Esalary = no;
		
	}
	public Object clone() throws CloneNotSupportedException 
	{
		return super.clone();
	}
}

class Copy
{
	public static void main(String arg[])throws Exception
	{
		Employee eobj = new Employee(11,"rahul",20000);
		System.out.println("EId:"+eobj.EID+"Name:"+eobj.Ename+"salary:"+eobj.Esalary);
		Employee eobjX = (Employee)eobj.clone();
		System.out.println("EId:"+eobjX.EID+"Name:"+eobjX.Ename+"salary:"+eobjX.Esalary);
		
	}
}