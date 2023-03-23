import java.util.Scanner;
class Sum{
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        System.out.println("enter a number:");
        int a=input.nextInt();
        
        System.out.println("factors are:");
        for(int i=1;i<=a;i++){
            if(a%i==0){
                System.out.println(i);
            }
        }
        input.close();

    }
}