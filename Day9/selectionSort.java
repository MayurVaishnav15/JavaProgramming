import java.util.Scanner;

public class selectionSort {
    // We select an element from Array and push to the starting of Array - Selection Sort
    public static void Selectionsort(int unsorted[]){
        for(int i=0;i<unsorted.length;i++){
            int minPos=i;
            for(int j=minPos+1;j<unsorted.length;j++){
                if(unsorted[minPos]>unsorted[j]){
                    minPos=j;
                }
            }
            int temp = unsorted[minPos]; 
            unsorted[minPos]=unsorted[i];
            unsorted[i]=temp;
            }System.out.print("The Sorted Array is :-  ");
            for(int i=0;i<unsorted.length;i++){
                System.out.print(unsorted[i]+", ");
            }
        }
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
        }System.out.println();
        sc.close();
        Selectionsort(unsorted);
        

    }
    
}
