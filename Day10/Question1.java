import java.util.Scanner;

public class Question1 {
    public static void findSeven(int matrix[][]) {
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==7){
                    sum++;
                }
            }
        } System.out.println("The number of 7's in matrix are :- "+sum);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows :- ");
        int n= sc.nextInt();
        System.out.print("Enter Number of Columns :- ") ;
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }sc.close();
        findSeven(matrix);

    }
}
    

