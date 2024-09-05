import java.util.Scanner;

public class spiralMatrix {
    public static void printSpiral(int matrix[][]){
        int startRow =0;
        int startCol =0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
         

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows :- ");
        int n = sc.nextInt();
        System.out.print("Enter number of colums :- ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.print("Enter element of matrix :- ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }sc.close();
        printSpiral(matrix);



    }
}
