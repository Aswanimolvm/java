import java.util.Scanner;

class Student{
int rollno,mark;
String name;


class Sports{
String spname = null;
int point;

  void get(){
        Scanner n = new Scanner(System.in);
        System.out.println("Enter name:");
        name = n.nextLine();
        System.out.println("Enter rollno:");
        rollno = n.nextInt();
        System.out.println("Enter mark:");
        mark = n.nextInt();

        System.out.println("Enter sport name:");
        spname = n.next();
        System.out.println("Enter point:");
        point = n.nextInt();
}

  void display(){

        System.out.println("***STUDENT DETAILS***");
        System.out.println("Student name:"+name);
        System.out.println("Rollno:"+rollno);
        System.out.println("marks:"+ mark);
        System.out.println("Sport name:"+ spname);
        System.out.println("Points:"+point);


}
}
}


class Main{
public static void main(String [] args){
Student st = new Student();
Student.Sports sp = st.new Sports();
sp.get();
sp.display();
}
}

