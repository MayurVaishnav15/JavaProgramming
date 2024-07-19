import java.util.*;
public class largestArray{
    public static int LargestOfArray(int List[]){
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<List.length;i++){
            if(largest<List[i]){
                largest = List[i];
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        System.out.println("Enter Your Array :-");
        Scanner sc = new Scanner(System.in);
        int List[] = new int[5];
        for(int i =0; i<List.length;i++){
            List[i]=sc.nextInt();
        }
        sc.close();
        System.out.print("The Array is :-  ");
        for(int i =0; i<List.length;i++){
            System.out.print(List[i]+ ", ");
        }
        System.out.println();
        System.out.print("Largest Value Of The Array Is :- "+ LargestOfArray(List));


    }
}