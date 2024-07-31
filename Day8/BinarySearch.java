import java.util.*;
public class BinarySearch { //Binary Search is alwasy applied on sorted Arrays
    public static int BinSearch(int Arr[],int key){
        int start = 0; int end = Arr.length -1;
        while(start<=end){
            int mid = (start+end)/2;
            if(Arr[mid]==key){
                return mid;
             }
             if(Arr[mid]<key){
                start=start+1;
             }
             else{
                end=mid-1;
             }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Array:- ");
        int Arr[] = new int[5];
        for(int i = 0;i<Arr.length;i++){
            Arr[i]=sc.nextInt();
        }
        System.out.println("The Array Is :- ");
        for(int i=0;i<Arr.length;i++){
           System.out.print(Arr[i]+ ", ");
        }
        System.out.println();
        System.out.print("Enter The Number You Want To Search:- ");
        int key = sc.nextInt();
        System.out.println("The required Number is at index : "+BinSearch(Arr,key));
        sc.close();
    }
}
