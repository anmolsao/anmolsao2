import java.util.Scanner;

public class Call 
{
	int a;
	int b;
	Scanner sc=new Scanner(System.in);

	public void add()
	{
		
		
		
		System.out.println("enter value of a=");
		int a=sc.nextInt();
		System.out.println("enter value of b=");
        int b=sc.nextInt();
        int c=a+b;
		System.out.println("Addition="+c);
		
		
	}
	
	
	
	
	public static void main(String args[]) 
	{
		Call c=new Call();
		c.add();
	}

}
