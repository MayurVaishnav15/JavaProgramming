import java.util.Scanner;
public class subArray {
    public static void Arraysubs(int Array[]){
        int ts = 0;
        for(int i = 0;i<Array.length;i++){
            int start = i;
            System.out.println();
            for(int j = i;j<Array.length;j++){
                int end = j;
                for(int k = start;k<=end;k++){
                    System.out.print(Array[k]+", ");
                }
                ts++;
                System.out.println();
            }
        }System.out.println("Total Pairs are "+ts);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array:-");
        int n = sc.nextInt();
        System.out.println("Enter Your Array:-");
        int Array[] = new int[n];
        for(int i = 0;i<Array.length;i++){
            Array[i] = sc.nextInt();
        }
        System.out.print("The array is :-  ");
        for(int i = 0; i<Array.length;i++){
            System.out.print(Array[i]+", ");
        }
        sc.close();
        Arraysubs(Array);
    }
}
