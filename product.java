import java.util.Scanner;
class Product
{
 int pcode,price;
 String pname;
 void get()
 {
  Scanner input=new Scanner(System.in);
  System.out.println("Enter the product code:");
  pcode=input.nextInt();
  System.out.println("Enter the product name:");
  pname=input.nextLine();
System.out.println("Enter the product price:");
  price=input.nextInt();
 }
 void display()
 {
  System.out.println("Product code:" +pcode);
  System.out.println("Product name:" +pname);
  System.out.println("Product price:" +price);
 }
}
class Main
{
public static void main (String args [])
{
 Product p1=new Product();
 Product p2=new Product();
 Product p3=new Product();
 p1.get();
 p2.get();
 p3.get();
 if(p1.price<p2.price)
 {
 System.out.println("Lowest price is:" +p1.price);
 }
 else
 {
   if(p2.price<p3.price)
   {
    System.out.println("Lowest price is:" +p2.price);
   }
   else
   {
    System.out.println("Lowest price is:" +p3.price);
   }
 }
}
}