package graphics;
import java.util.Scanner;
interface Area3
{
void get3();
void show3();
}
public class Circle implements Area3
{
Scanner sc=new Scanner(System.in);
int r;
double a3;
double pi=3.14;
public void get3()
{
System.out.println("Enter the radius:");
r=sc.nextInt();
}
public void show3()
{
a3=pi*r*r;
System.out.println("The area of circle is:" +a3);
}
}