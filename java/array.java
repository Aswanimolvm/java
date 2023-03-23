import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
int arr[]=new int[5];
System.out.println("Enter 5 elements:");
for(int i=0;i<5;i++)
arr[i]=input.nextInt();
System.out.println("numbers are:");
for(int i =0;i<5;i++)
System.out.println(arr[i]);
int temp;
for(int i=0;i<5;i++){
for(int j=i;j<5;j++){
if (arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("after sorting:");
for(int i=0;i<5;i++)
System.out.println(arr[i]);
int sum=0;
for(int i=0;i<5;i++){
sum=sum+arr[i];
}
System.out.println("Sum is:"+sum);

System.out.println("minimum value is:"+arr[0]);
System.out.println("maximum value is:"+arr[4]);
System.out.println("Enter the element you want to search:");
int search=input.nextInt();
int p=-1;
for(int i=0;i<5;i++){
if(arr[i]==search){
 p=i;
break;
}
}
if(p>=0)
System.out.println("number found at "+p+"th position");
else
System.out.println("number not found");
}
}