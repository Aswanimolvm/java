import java.util.Scanner;
interface Shape{
    void Area();
    void Perimeter();
}
class Circle implements Shape{
    double radius;
    public Circle(double radius){
        this.radius=radius;

    }
    public void Area(){
        double a=3.14*radius*radius;
        System.out.println("Area of circle:"+a);
    }
    public void Perimeter(){
        double p=2*3.14*radius;
        System.out.println("Perimeter of circle is:"+p);

    }
}
class Rectangle implements Shape{
    int l,b;
    Rectangle(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void  Area(){
        int a=l*b;
        System.out.println("Area of rectangle is:"+a);
    }
    public void Perimeter(){
        int p=2*(l+b);
        System.out.println("Perimeter of rectangle is:"+p);
    }
}
class main6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("\n1.circle\n2.rectangle\n3.exit");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter radius of the circle:");
                double r=sc.nextDouble();
                Circle obj=new Circle(r);
                obj.Area();
                obj.Perimeter();
            }
            else if(choice ==2){
                System.out.println("Enter length and breadth of the rectangle:");
                int l=sc.nextInt();
                int b=sc.nextInt();
                Rectangle obj=new Rectangle(l, b);
                obj.Area();;
                obj.Perimeter();
            }
            else if(choice==3){
                System.out.println("EXIT POINT");
                System.exit(0);
            }
            else{
                System.out.println("Invalid choice");
            }
    }while(true);
}
}