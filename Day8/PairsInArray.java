import java.util.*;
public class PairsInArray {

    public static void PairingArray(int Array[]){
        System.out.println("The pairs are:-");
        for(int i = 0;i<Array.length;i++){
            int current = Array[i];
            for(int j = i+1;j<Array.length;j++){
                System.out.print("("+current+","+ Array[j]+")"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of Array:- ");
        int n = sc.nextInt();
        System.out.println("Enter Your Array:-");
        int Array[] = new int[n];
        for(int i=0;i<Array.length;i++){
            Array[i] = sc.nextInt();
        }
        System.out.print("The array is:-  ");
        for(int i =0;i<Array.length;i++){
            System.out.print(Array[i]+", ");
        }
        System.out.println();
        PairingArray(Array);
        sc.close();
    }  
}
