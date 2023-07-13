package arithmetic;
import java.util.Scanner;
interface A3
{
void get();
void show();
}
public class Product implements A3
{
Scanner sc=new Scanner(System.in);
int a,b;
int mul;
public void get()
{
System.out.println("Enter a:");
a=sc.nextInt();
System.out.println("Enter b:");
b=sc.nextInt();
}
public void show()
{
mul=a*b;
System.out.println("The product is:" +mul);
}
}