import java.util.Scanner;
public class spiralMatPrac {
    public static void spiral(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<= endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:- ");
        int n = sc.nextInt();
        System.out.print("Enter number of Columns:- ");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter your matrix elements:- ");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                 matrix[i][j]= sc.nextInt();
            }

        }System.out.println("The Matrix is -");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                 System.out.print(matrix[i][j]+" ");
            }System.out.println();
           
        }sc.close();
        spiral(matrix);

    }
}
