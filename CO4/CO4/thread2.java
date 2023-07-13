import java.util.Scanner;
class Fib implements Runnable
{
  int a=0,b=1,sum=0,n;
	public void run()
	{
		System.out.println("Fibonacci series:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n:");
		n=sc.nextInt();
	for (int i = 1; i <= n; i++)
     {
      System.out.println(a);
      sum=a+b;
      a=b;
      b=sum;
      }
	}
}
class Even implements Runnable
{ 
	public void run()
	{  
	int number,i;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("EVEN NUMBERS");
	 System.out.println("\n Enter the number:");
	 number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 == 0)
			{
				System.out.print(i+ "\n"); 
			}
		}	
	}}
class Main
{
	public static void main(String args[])
	{  

		Fib f=new Fib();
		Even e=new Even();
		Thread t1 =new Thread(f);   
		Thread t2=new Thread(e);  
		
		t1.start();
    	t2.start();
		
 	}  
}