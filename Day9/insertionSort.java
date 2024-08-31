import java.util.Scanner;
public class insertionSort {
    public static void InsertionSort(int unsorted[]){
        for(int i=1;i<unsorted.length;i++){
            int key = unsorted[i];
            int prevIndex= i-1;
            while (prevIndex>=0 && unsorted[prevIndex]>key) {
                unsorted[prevIndex+1]=unsorted[prevIndex];
                prevIndex--;
            } //Insertion now
            unsorted[prevIndex+1]=key;
        }System.out.print("The Sorted Array is :-  ");
        for(int i=0;i<unsorted.length;i++){
            System.out.print(unsorted[i]+", ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of your Array :- ");
        int n = sc.nextInt();
        int unsorted[] = new int[n];
        System.out.print("Enter your Array:- ");
        for(int i=0;i<unsorted.length;i++){
            unsorted[i]=sc.nextInt();
        }System.out.print("The Unsorted Array is :- ");
        for(int i=0;i<unsorted.length;i++){
            System.out.print(unsorted[i]+", ");
        }System.out.println();
        sc.close();
        InsertionSort(unsorted);
    }
}
