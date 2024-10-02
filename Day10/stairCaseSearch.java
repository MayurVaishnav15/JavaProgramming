import java.util.Scanner;

public class stairCaseSearch {
    public static boolean stairCaseSearching(int matrix[][],int key){
        int row = 0;
        int col=matrix[0].length-1;
        while(row < matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Found at "+"("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Number Not Found...");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no. of Rows :- ");
        int n = sc.nextInt();
        System.out.print("Enter no. of Columns :- ");
        int m = sc.nextInt();
        int matrix[][]=new int [n][m];
        System.out.println("Enter Sorted Matrix :-");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]= sc.nextInt();
            }
        }System.out.println("The matrix is :-");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.print("Enter the number your want to Search :- ");
        int key = sc.nextInt();
        sc.close();
        stairCaseSearching(matrix,key);

    }

}
