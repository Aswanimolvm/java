import java.util.Scanner;
 class Matrix
{
 public static void main(String args[])
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Please enter number of rows:");
  int row = input.nextInt();
  System.out.println("Please enter number of columns:");
  int col = input.nextInt();
  int[][] x= new int[row][col];
  int[][] y= new int[row][col];
   System.out.println("Please enter first matrix:");
   for(int m=0;m<row;m++)
   {
    for(int n=0;n<col;n++)
     {
       x[m][n] = input.nextInt();
      }
   }
    System.out.println("Please enter second matrix:");
    for(int m=0;m<row;m++)
    {
     for(int n=0;n<col;n++)
      {
        y[m][n] = input.nextInt();
      }
      }
      int[][] z= new int[row][col];
      for(int m=0;m<row;m++)
      {
      for(int n=0;n<col;n++)
     {
      z[m][n] = x[m][n] + y[m][n];
     }
      }
      System.out.println("The addition of two matrices is:");
      for(int m=0;m<row;m++)
      {
      for(int n=0;n<col;n++)
       {
       System.out.print(z[m][n] + " ");
       }
         System.out.println();
      }
        
   }
}