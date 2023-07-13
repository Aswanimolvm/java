import java.util.Scanner;
class Employee{
    int eNo,eSalary;
    String eName;
    Scanner sc=new Scanner(System.in);
    Employee(){
        System.out.println("Enter Employee Number:");
        eNo=sc.nextInt();
        System.out.println("Enter Employee Name:");
        eName=sc.next();
        System.out.println("Enter Employee Salary:");
        eSalary=sc.nextInt();
    }

}
class main4{
    public static void main(String args[]) {
        Employee arr[]=new Employee[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("Details of Employee "+(i+1));
            arr[i]=new Employee();
        }
        while(true){
            System.out.println("1.search");
            System.out.println("2.Exit");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter employee Number to search for an employee:");
                int eNo=sc.nextInt();
                int flag=0;
                for(int i=0;i<3;i++){
                    if(eNo==arr[i].eNo){
                        System.out.println("Employee Details:");
                        System.out.println("Eno:"+arr[i].eNo);
                        System.out.println("Name:"+arr[i].eName);
                        System.out.println("Salary:"+arr[i].eSalary);
                        flag=1;
                        break;
                    }    
                }
                if(flag==0){
                    System.out.println("Employee not found.");
                }
            }
            else if(choice==2){
                System.out.println("Exit point.");
                System.exit(0);
            }
            else{
                System.out.println("Invalid choice");
            }
    }

    }
}