import java.util.Scanner;
class Reverse{
public static void main(String args[]){
System.out.println("hello");
Scanner input=new Scanner(System.in);
System.out.println("enter a number:");
int a=input.nextInt();
System.out.println("number is:"+a);
int temp,rev=0;
while(a>0){
temp=a%10;
rev=rev*10+temp;
a=a/10;
}
System.out.println("Reverse is:"+rev);
}

}
