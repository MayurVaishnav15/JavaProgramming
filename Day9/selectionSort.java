import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Array size:- ");
        int n = sc.nextInt();
        System.out.print("Enter Your Array:-  ");
        int unsorted[]= new int[n];
        for(int i=0;i<unsorted.length;i++){
            unsorted[i]=sc.nextInt();
        }System.out.print("The Unsorted array is :-  ");
        for(int i=0;i<unsorted.length;i++){
            System.out.print(unsorted[i]+", ");
        }
        

    }
    
}
