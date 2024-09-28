import java.util.Scanner;

public class diagonalSum {
    public static int diagonalsum(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(i!=matrix.length-i-1){
                sum+=matrix[i][matrix.length-i-1];
            }
        }
        return sum;
        }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Matrix information:- ");
            System.out.print("Enter Nunber of Rows : ");
            int n= sc.nextInt();
            System.out.print("Enter Nunber of Colums : ");
            int m= sc.nextInt();
            System.out.println("Enter your matrix :- ");
            int matrix[][]=new int[n][m];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j] = sc.nextInt();
                }
            }System.out.println("Your Matrix is:-");
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                   System.out.print(matrix[i][j]+" "); 
                } System.out.println();
            }sc.close();
            System.out.println("The diagonal sum is "+diagonalsum(matrix)); 
        }
    }
    

