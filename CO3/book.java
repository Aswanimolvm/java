import java.util.Scanner;
class Publisher
{ 
   String name;
   int pub_id;
   Scanner sc=new Scanner(System.in);
   Publisher()
   { 
   System.out.println("enter id ");
   pub_id= sc.nextInt(); 
   System.out.println("enter name"); 
   name = sc.next();
   } }
  class Book extends Publisher
  {
       String b_name;
       Scanner sc= new Scanner(System.in);
       Book() 
      { 
       System.out.println("enter book name");
       b_name = sc.next();
     } }
  class Literature extends Book
     {
     String l_name,pub1; 
     Scanner sc = new Scanner(System.in); 
     Literature()
     {  
     System.out.println("enter literature book name:");
     l_name = sc.next();
     System.out.println("enter publisher:"); 
     pub1 = sc.next(); 
     } 
     }
    class Fiction extends Literature
     {
     String f_name,pub2; 
     Scanner sc = new Scanner(System.in); 
     Fiction()
     {  
     System.out.println("enter fictional book name:");
     f_name = sc.next();
     System.out.println("enter publisher:"); 
     pub2 = sc.next(); 
     } 
    void display() 
    { 
    System.out.println("Publisher ID:"+pub_id);
    System.out.println("Publisher Name:"+name); 
    System.out.println("Book Name:"+b_name); 
    System.out.println("Literature:"+l_name); 
    System.out.println("Publisher:"+pub1);
    System.out.println("Fiction:"+f_name);
    System.out.println("Publisher:"+pub2); 
   } } 
   public class Main
   {
   	public static void main(String args[])
   	 { 
   	 Fiction f=new Fiction();
   	 System.out.println("BOOK DETAILS");
   	 System.out.println("-----------------");
         f.display();
  }}