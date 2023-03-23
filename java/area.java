import java.util.Scanner;
class Area{
int length,breadth;
void read(){
Scanner input=new Scanner(System.in);
System.out.println("enter length of rectangle:");
length=input.nextInt();
System.out.println("enter breadth of rectangle:");
breadth=input.nextInt();

}
void Area(){
int area=length*breadth;
System.out.println("area is:"+area);
}
void perimeter(){
int perimeter=2*(length+breadth);
System.out.println("Perimeter is:"+perimeter);
}

}


class Main{
public static void main(String args[]){
Area a=new Area();
a.read();
a.Area();
a.perimeter();
}
}