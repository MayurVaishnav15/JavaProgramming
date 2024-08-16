import java.util.Scanner;

public class bubbleSort {
    public static void SortBubble(int unsorted[]){
        for(int turn=0;turn<unsorted.length-1;turn++){
            for(int j=0;j<unsorted.length-1-turn;j++){
                if(unsorted[j]<unsorted[j+1]){
                    int temp=unsorted[j];
                    unsorted[j]=unsorted[j+1];
                    temp=unsorted[j+1]=temp;
                }
            }
        }System.out.print("The Sorted Array is :-  ");
        for(int i=0;i<unsorted.length;i++){
            System.out.print(unsorted[i]+", ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of your Array:- ");
        int n = sc.nextInt();
        System.out.print("Enter your Array for Sorting:-  ");
        int unsorted[] = new int[n];
        for(int i=0;i<unsorted.length;i++){
            unsorted[i]=sc.nextInt();
        }System.out.print("The Unsorted array is = ");
        for(int i=0;i<unsorted.length;i++){
            System.out.print(unsorted[i]+", ");
        } System.out.println();
        sc.close();
        SortBubble(unsorted);
    }
}
