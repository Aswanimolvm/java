package arithmetic;
import java.util.Scanner;
interface A4
{
void get();
void show();
}
public class Division implements A4
{
Scanner sc=new Scanner(System.in);
int a,b;
int div;
public void get()
{
System.out.println("Enter a:");
a=sc.nextInt();
System.out.println("Enter b:");
b=sc.nextInt();
}
public void show()
{
div=a/b;
System.out.println("The qoutient is:" +div);
}
}