import java.util.Scanner;
class NegativeException extends Exception
{
        NegativeException(String str)
        {
                super(str);
        }
}

class Avg
{
        void check(int n) throws NegativeException
        {
               if (n<0)
               {
                       throw new NegativeException("Cannnot accept negative values");
               }
               else
               {
                       System.out.println("Value acceptable");
               }
        }
}

public class Main
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                try
                {
                        Avg av=new Avg();
                        int i,sum=0;
                        double avg;
                        System.out.println("Enter the range:");
                        int r=sc.nextInt();
                        for(i=0;i<r;i++)
                        {
                                System.out.println("Enter number:");
                                int n=sc.nextInt();
                                av.check(n);
                                sum=sum+n;
                        }
                        avg=sum/r;
                        System.out.println("The average is:" +avg);
                        
                }
                catch(NegativeException e)
                {
                        System.out.println("Negative number   " +e);
                }
               
        }
}