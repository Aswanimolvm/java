package arithmetic;
import java.util.Scanner;
interface A2
{
void get();
void show();
}
public class Subtract implements A2
{
int a,b;
int dif=0;
public void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a:");
a=sc.nextInt();
System.out.println("Enter b:");
b=sc.nextInt();
}
public void show()
{
dif=a-b;
System.out.println("The difference is:" +dif);
}

}