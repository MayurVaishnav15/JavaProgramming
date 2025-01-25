import java.util.*;

public class inbuildSort {
    public static void InBuildSorting(Integer Array[]){
        Arrays.sort(Array,0,6,Collections.reverseOrder());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        Integer n = sc.nextInt();
        Integer Array[]= new Integer[n];
        System.out.print("Enter Your Array : ");
        for(int i=0;i<Array.length;i++){
            Array[i]=sc.nextInt();
        }
        System.out.print("Your Unsorted Array : ");
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i] + ", ");
        }sc.close();
        System.out.println();
        InBuildSorting(Array);
        System.out.print("Your Sorted Array : ");
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]+", ");
        }
    }
}

