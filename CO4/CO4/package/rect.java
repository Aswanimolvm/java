package graphics;
import java.util.Scanner;
interface Area4
{
void get();
void show();
}

public class Rect implements Area4
{
Scanner sc=new Scanner(System.in);
int l,b;
int a;
public void get()
{
System.out.println("Enter the length:");
l=sc.nextInt();
System.out.println("Enter the breadth:");
b=sc.nextInt();
}

public void show()
{
a=l*b;
System.out.println("The area of rectangle is:" +a);
}
}