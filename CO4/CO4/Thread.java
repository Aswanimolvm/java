import java.util.Scanner;
class Multi extends Thread
{
  int a=5,m;
        public void run()
        {
        System.out.println("MULTIPLICATION TABLE");
        for(int i=1;i<=10;i++)
        {
        m=a*i;
        System.out.println(a+ "*" +i+ "=" +m);
        }
        }
}
class Prime extends Thread
{
int n;
Prime(int n)
{
 this.n=n;
}
        public void run()
        {
        int i, j,k;
         System.out.println("Prime numbers between 1 and " + n + " are:");

            for (i = 1; i <= n; i++)
            {

                if (i == 1 || i == 0)
                    continue;

                k= 1;
              for (j = 2; j <= i / 2; j++)
                {
                    if (i % j == 0)
                    {
                        k = 0;
                        break;
                    }
                }


                if (k == 1)
                    System.out.println(i + " ");
            }
        }
  }

class Main
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                Multi m=new Multi();
                System.out.println("\n First N prime numbers");
                System.out.println("Enter the limit:");
                int n = sc.nextInt();
                Prime p=new Prime(n);
                m.start();
                p.start();

        }
}