import java.util.Scanner;
class sort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char arr[]=new char[20];
        System.out.println("Enter a string:");
        String str=sc.next();
        int l=str.length();
        arr=str.toCharArray();
        char temp;
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                if(arr[i]>arr[j]){
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        System.out.println(str+" after sorting:");
        System.out.println(arr);
    }
}