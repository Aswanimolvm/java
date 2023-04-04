import java.util.Scanner;
class transpose1{

    int arr1[][]=new int[10][10];
    int arr2[][]=new int[10][10];
    int m,n;
    Scanner sc=new Scanner(System.in);
    void Read(){
        System.out.println("Enter row size:");
        m=sc.nextInt();
        System.out.println("Enter column size:");
        n=sc.nextInt();
        System.out.println("Enter "+m*m+" elements of the matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr1[i][j]=sc.nextInt();

            }
        }
        System.out.println("matrix is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
    }
    void Transpose(){
        for (int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                arr2[j][i]=arr1[i][j];
            }
        }
        System.out.println("transpose of the matrix is:");
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
    void Symmetric(){
        int flag=0;
        for (int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(arr1[i][j]!=arr2[i][j]){
                    flag++;
                    break;
                }
            }
        }
        if(flag==0){
            System.out.println("Matrix is symmetric");
        }
        else{
            System.out.println("Matrix is asymmetric");
        }
    }

}
class matrix_4 {
    public static void main(String args[]){
        transpose1 a=new transpose1();
        a.Read();;
        a.Transpose();
        a.Symmetric();

    }
    
}