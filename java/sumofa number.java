import java.util.Scanner;
class Sum{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.println("Enter a number:");
int a=input.nextInt();
System.out.println("Number is:"+a);
int sum=0,temp;
while(a>0){
temp=a%10;
sum=sum+temp;
a=a/10;

}
System.out.println("Sum is:"+sum);

}
}
