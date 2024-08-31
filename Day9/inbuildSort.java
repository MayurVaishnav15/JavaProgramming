import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class inbuildSort {
    public static void InbuildSorting(Integer Arr[]){
          Arrays.sort(Arr, Collections.reverseOrder());
        for(int i=0;i<Arr.length;i++){
             System.out.print(Arr[i]+", ");
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of your Array :- ");
        int n = sc.nextInt();
        System.out.print("Enter Your Array :- ");
        Integer Arr[] = new Integer[n];
        for(int i=0;i<Arr.length;i++){
            Arr[i]=sc.nextInt();
        }
        sc.close();
        InbuildSorting(Arr);
    }
}
