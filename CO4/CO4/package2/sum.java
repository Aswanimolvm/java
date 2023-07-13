package arithmetic;
import java.util.Scanner;
interface A1
{
void get();
void show();
}
public class Sum implements A1
{
Scanner sc=new Scanner(System.in);
int a,b;
int sum=0;
public void get()
{
System.out.println("Enter a:");
a=sc.nextInt();
System.out.println("Enter b:");
b=sc.nextInt();
}
public void show()
{
sum=a+b;
System.out.println("The sum is:" +sum);
}
}