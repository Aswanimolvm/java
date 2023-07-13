import java.util.Scanner; 
 class Employee
 { 
 int empid,salary;
 String name,address;
Employee()
{
       Scanner sc =new Scanner(System.in); 
       System.out.println("Enter the Employee ID:");
       empid=sc.nextInt();
       System.out.println("Enter Name:");
       name=sc.next();
       System.out.println("Enter the Salary:");
       salary=sc.nextInt();
       System.out.println("Enter Address:");
       address=sc.next();
}
}
class Teacher extends Employee
{
        String dept,sub1,sub2,sub3;
        Teacher()
        {
                Scanner sc =new Scanner(System.in); 
                System.out.println("Enter Department:");
                dept=sc.next();
                System.out.println("Enter Subject1:");
                sub1=sc.next();
                System.out.println("Enter Subject2:");
                sub2=sc.next();
                System.out.println("Enter Subject3:");
                sub3=sc.next();
        }
        void display()
        {
             System.out.println("Empolyee ID:" +empid); 
             System.out.println("Name:" +name); 
             System.out.println("Salary:" +salary);
             System.out.println("Address:" +address); 
             System.out.println("Department:" +dept); 
             System.out.println("Subject1:" +sub1);
             System.out.println("Subject2:" +sub2);
             System.out.println("Subject3:" +sub3);

        }
}
 
 public class Main
 {
 public static void main(String args[])
 { 
   Scanner sc =new Scanner(System.in); 
 System.out.println("\nEnter the No.of teacher"); 
 int n=sc.nextInt();
 Teacher t[]=new Teacher[n]; 
 for(int i =0;i<n;i++)
 { 
 t[i]=new Teacher(); 
  } 
 System.out.println("-------------------");
 System.out.println("\n TEACHER DETAILS"); 
 System.out.println("-------------------");
 for(int i=0;i<n;i++)
 { 
 t[i].display(); 
  System.out.println("-------------------");
 } 
 }
 }