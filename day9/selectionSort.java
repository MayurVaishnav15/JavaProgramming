import java.util.Scanner;

public class selectionSort{
    public static void SelectionSorting(int Array[]) {
        for(int i=0;i<Array.length;i++){
                int minPos = i;
                for(int j=i+1;j<Array.length;j++){
                    if(Array[minPos]>Array[j]){
                        minPos=j;
                    }
                }
                int temp = Array[minPos];
                Array[minPos]= Array[i];
                Array[i]=temp;

            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of your Array :- ");
        int n = sc.nextInt();
        int Array[]=new int[n];
        System.out.print("Enter your Array :-");
        for(int i=0;i<Array.length;i++){
            Array[i]=sc.nextInt();
        }
        System.out.print("Your array is :- ");
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]+", ");
        }
        sc.close();
        SelectionSorting(Array);
        System.out.println();
        System.out.print("The Sorted Array is : ");
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]+", ");
        }
    }
}