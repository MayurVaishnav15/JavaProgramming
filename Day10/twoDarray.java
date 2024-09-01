import java.util.Scanner;
public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of your 2D Array :- ");
        System.out.print("Enter number of Rows :- ");
        int n = sc.nextInt();
        System.out.print("Enter number of Columns :- ");
        int m = sc.nextInt();
        int Arr[][] = new int [n][m];
        System.out.println("Enter your "+n+"x"+m+" size Array :- ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                Arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
