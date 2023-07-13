package graphics;
import java.util.Scanner;
interface Area1
{
void get1();
void show1();
}
public class Square implements Area1
{
Scanner sc=new Scanner(System.in);
int s,a1;
public void get1()
{
System.out.println("Enter the side:");
 s=sc.nextInt();

}
public void show1()
{
a1=s*s;
System.out.println("The area of Square is:" +a1);
}
}