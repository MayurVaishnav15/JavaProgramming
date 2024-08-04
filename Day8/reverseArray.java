import java.util.Scanner;

public class reverseArray {
    public static void ReverseArray(int Arr[]){
        int first =0, last =Arr.length-1;
        while (first<last) {
            int temp = Arr[last];
            Arr[last]= Arr[first];
            Arr[first]= temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array:- ");
        int n = sc.nextInt();
        int Arr[]= new int[n];
        System.out.println("Enter your Array:- ");
        for(int i = 0;i<Arr.length;i++){
           Arr[i] = sc.nextInt();
        }
        System.out.print("The Orignal Array is:- ");
        for(int i = 0;i<Arr.length;i++){
           System.out.print(Arr[i]+", ");
        }
         ReverseArray(Arr);
         sc.close();
         System.out.println();
         System.out.print("The Reversed Array is:- ");
        for(int i = 0;i<Arr.length;i++){
           System.out.print(Arr[i]+", ");
        }
    }
    
}
