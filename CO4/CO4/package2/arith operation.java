import arithmetic.*;
import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
arithmetic.Sum s1=new arithmetic.Sum();
arithmetic.Subtract sb1=new arithmetic.Subtract();
arithmetic.Product p1=new arithmetic.Product();
arithmetic.Division d1=new arithmetic.Division();
s1.get();
s1.show();
sb1.get();
sb1.show();
p1.get();
p1.show();
d1.get();
d1.show();
}
}