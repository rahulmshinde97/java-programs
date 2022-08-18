import java.lang.*;
class pattern2
{
	public static void main(String arg[])
 {
	int i,j,row=5;
	
	for(i=0;i<=row;i++)
	{
		for(j=row-1;j>i;j--)
		{
			System.out.println(" ");
			
		}
	}	
   for(j=0;j<=i;j++)
	{
		System.out.println("*");
	}
	System.out.println("\n");
		
	
  }
}