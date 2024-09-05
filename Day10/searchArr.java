import java.util.Scanner;
public class searchArr {
    public static boolean Search(int Arr[][],int key){
        for(int i=0;i<Arr.length;i++){
            for(int j=0;j<Arr[0].length;j++){
                if(Arr[i][j]==key){
                    System.out.println("Found at Dimentions "+i+"x"+j);
                    return true;
                }
            }
        }System.out.println("Not Found");
        return false;
    }
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
        }System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }System.out.println();
        System.out.print("Enter the number your want to search :- ");
        int key = sc.nextInt();
        Search(Arr,key);
        sc.close();
    }
}
