import java.util.Scanner;
class Arr
{
public static void main(String args[])
{
int a[]=new int[5];
int temp=0,i,j,sum=0;
Scanner input=new Scanner(System.in);
System.out.println("Enter elements:");
for(i=0;i<5;i++)
{
a[i]=input.nextInt();
}
System.out.println("Elements are:");
for(i=0;i<5;i++)
{
System.out.println(a[i]);
}
for(i=0;i<5;i++)
{
sum=sum+a[i];

}
System.out.println("Sum:" +sum);

for(i=0;i<5;i++)
{
for(j=i;j<5;j++)
{
if(a[j]>a[i])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
System.out.println("Sorted elements:");
for(i=0;i<5;i++)
{
System.out.println(a[i]);
}
System.out.println("Maximum value is:" +a[4]);
System.out.println("Minimum value is:" +a[0]);
System.out.println("Enter the item to be searched:");
int item=input.nextInt();
int p=-1;
for(i=0;i<5;i++)
{
if(a[i]==item)
{
p=i;
break;


}}
if(p>=0)
System.out.println("Item found at position:" +p);
else
System.out.println("Item not found");
}}