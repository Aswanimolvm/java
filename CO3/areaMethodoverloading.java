import java.util.Scanner;
class MethodOverloading {
    public static void main(String[] args) {
        Area a = new Area();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of square");
        int s = sc.nextInt();
        System.out.println("Area of square is " + a.area(s));
        System.out.println("Enter the length and breadth of rectangle");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of rectangle is " + a.area(l, b));
        System.out.println("Enter the radius of circle");
        float r = sc.nextFloat();
        System.out.println("Area of circle is " + a.area(r));
        System.out.println("Enter the base and height of triangle");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of triangle is " + a.area(base, height));
        
    }
    
}

class Area {
    public int area(int a) {
        return a * a;
    }
    
    public int area(int a, int b) {
        return a * b; 
    }
    
    public float area(float r) {
        return 3.14f * (r * r); 
    }
    public double area(double b, double h) {
        return 0.5*(b * h);
    }
}