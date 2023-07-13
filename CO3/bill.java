import java.util.Scanner;
interface MyInterface{
       void Calc();
}
class Bill implements MyInterface{
     int p_id;
     String p_name;
     int p_quantity;
     int unit_price;
     int total=0;
     public Bill(int p_id,String p_name,int p_quantity,int unit_price){
          this.p_id=p_id;
          this.p_name=p_name;
          this.p_quantity=p_quantity;
          this.unit_price=unit_price;
     }
     public void Calc(){
          total=p_quantity*unit_price;
     }
     void Display(){
          System.out.println(p_id+"           "+p_name+"      "+p_quantity+"          "+unit_price+"           "+total);
     }
}
class main7{
     public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          Bill arr[]=new Bill[2];
          for(int i=0;i<2;i++){
               System.out.println("Enter product id:");
               int id=sc.nextInt();
               System.out.println("Enter product Name:");
               String name=sc.next();
               System.out.println("Enter product quantity:");
               int q=sc.nextInt();
               System.out.println("Enter unit price:");
               int u=sc.nextInt();
               arr[i]=new Bill(id,name,q,u);
          }
          System.out.println("Order no:321");
          System.out.println();
          System.out.println("Date:9.07.23");
          System.out.println("product Id   Name   Quantity   Unit Price   Total");
          System.out.println("_________________________________________________");
          int net=0;
          for(int i=0;i<2;i++){
               arr[i].Calc();
               arr[i].Display();
               net=net+arr[i].total;
          }
          System.out.println("_________________________________________________");
          System.out.println("                               Net Amount     "+net);
     }
}