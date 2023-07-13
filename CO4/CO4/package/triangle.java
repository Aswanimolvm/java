package graphics;
import java.util.Scanner;
interface Area2
{
void get2();
void show2();
}
public class Triangle implements Area2
{
Scanner sc=new Scanner(System.in);
int b,h;
double a2;
public void get2()
{
System.out.println("Enter the base:");
b=sc.nextInt();
System.out.println("Enter the height:");
h=sc.nextInt();
}
public void show2()
{
a2=.5*b*h;
System.out.println("The area of triangle is:" +a2);
}
}