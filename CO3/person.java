import java.util.Scanner;
class person{
    String name,gender,address;
    int age;
    person(String name,String gender,String address,int age){
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
}
class Employee extends person{
    int empid,salary;
    String company_name,qualification;
    Employee(int empid,String company_name,String qualification,int salary,String name,String gender,String address,int age){
        super(name, gender, address, age);
        this.empid=empid;
        this.company_name=company_name;
        this.qualification=qualification;
        this.salary=salary;
    }
}
class Teacher extends Employee{
    String subject;
    String Department;
    int TeacherID;
    Teacher(String subject,String Department,int TeacherID,int empid,String company_name,String qualification,int salary,String name,String gender,String address,int age){
        super(empid, company_name, qualification, salary, name, gender, address, age);
        this.subject=subject;
        this.Department=Department;
        this.TeacherID=TeacherID;
    }
    void Display(){
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Address:"+address);
        System.out.println("Age:"+age);
        System.out.println("Employee ID:"+empid);
        System.out.println("Company Name:"+company_name);
        System.out.println("Qualififcation:"+qualification);
        System.out.println("Salary:"+salary);
        System.out.println("Teacher ID:"+TeacherID);
        System.out.println("Department:"+Department);
        System.out.println("Subject:"+subject);
    }

}
class Main3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of persons:");
        int n=sc.nextInt();
        Teacher arr[]=new Teacher[10];
        for(int i=0;i<n;i++){
            System.out.println("Details of Person "+(i+1));
            System.out.println("_____________");
            System.out.println("Enter Name:");
            String name=sc.next();
            System.out.println("Enter Gender:");
            String gender=sc.next();
            System.out.println("Enter Address:");
            String address=sc.next();
            System.out.println("Enter Age:");
            int age=sc.nextInt();
            System.out.println("Enter Employee Id:");
            int empid=sc.nextInt();
            System.out.println("Enter Company Name:");
            String cname=sc.next();
            System.out.println("Enter qualififcation:");
            String Quali=sc.next();
            System.out.println("Enter Salary:");
            int salary=sc.nextInt();
            System.out.println("Enter subject:");
            String sub=sc.next();
            System.out.println("Enter Department:");
            String dept=sc.next();
            System.out.println("Enter Teacher ID:");
            int tid=sc.nextInt();
            arr[i]=new Teacher(sub, dept, tid, empid, cname, Quali, salary, name, gender, address, age);
        }
        for(int i=0;i<n;i++){
            System.out.println("Details of Person "+(i+1));
            System.out.println("_____________________");
            arr[i].Display();
        }  
    }