import java.util.Scanner;
class Student{
    String Name;
    int a_score;
    int roll_no;
    Student(String Name,int a_score,int roll_no){
        this.Name=Name;
        this.a_score=a_score;
        this.roll_no=roll_no;
    }
}
class Sports extends Student{
    String sport_item;
    int s_score;
    Sports(String sport_item,int s_score,String Name,int a_score,int roll_no){
        super(Name, a_score, roll_no);
        this.sport_item=sport_item;
        this.s_score=s_score;
    }
}
class Result extends Sports{
    int total;
    Result(String sport_item,int s_score,String Name,int a_score,int roll_no){
        super(sport_item, s_score, Name, a_score, roll_no);
        total=s_score+a_score;
    }
    void Display(){
        System.out.println("Roll Number:"+roll_no);
        System.out.println("Nmae:"+Name);
        System.out.println("Academic Score:"+a_score);
        System.out.println("Sports item:"+sport_item);
        System.out.println("Sports Score:"+s_score);
        System.out.println("Total Score:"+total);
    }
}
class Main5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Roll Number:");
        int r=sc.nextInt();
        System.out.println("Enter your Name:");
        String name=sc.next();
        System.out.println("Enter your Academic Score:");
        int a=sc.nextInt();
        System.out.println("Enter the name of the sport item you participated:");
        String sport=sc.next();
        System.out.println("Enter your Sports score:");
        int s=sc.nextInt();
        Result obj=new Result(sport, s, name, a, r);
        obj.Display();
    }
}