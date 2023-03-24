import java.util.*;

class Calculator
{
public static void main(String args[])
{

int num1=0,num2=0,option,ex;
do
{
Scanner input= new Scanner(System.in);
System.out.println("Enter your choice:");
System.out.println("1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit");
option = input.nextInt();
if(option!=5){
System.out.println("Enter  first number");
num1=input.nextInt();
System.out.println("Enter  second number");
num2=input.nextInt();
}
else
break;
switch(option)
{
case 1:System.out.println("Addition of "+num1+" and "+num2+" is "+(num1+num2));
break;
case 2:System.out.println("Subtraction of "+num1+" and "+num2+" is "+(num1-num2));
break;
case 3:System.out.println("Multiplication of "+num1+" and "+num2+" is "+(num1*num2));
break;
case 4: if(num2==0)
System.out.println("Error!!! In Division denominator cannot be 0!");
else{
System.out.println("In division of "+num1+" by "+num2+" quotient is "+(num1/num2)+" and remainder is "+(num1%num2));}
break;
case 5: break;
default: System.out.println("Invalid choice");
}
System.out.println("Do you want to continue?1.Yes 2.No");
ex=input.nextInt();
}while(ex==1);
}
}
