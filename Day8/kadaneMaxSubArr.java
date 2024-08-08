import java.util.Scanner;

public class kadaneMaxSubArr {
    public static void kadane(int Array[]){
        int ms =Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<Array.length;i++){
            currSum+=Array[i];
            if(currSum<0){
                currSum=0;
            } ms=Math.max(currSum, ms);
        }System.out.println("The maximum Sum of SubArray is "+ms);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of your Array:- ");
        int n = sc.nextInt();
        int Array[] = new int[n];
        System.out.print("Enter Your Array:-  ");
        for(int i=0;i<Array.length;i++){
            Array[i]= sc.nextInt();
        }System.out.print("The Array is :- ");
        for(int i = 0;i<Array.length;i++){
            System.out.print(Array[i]+", ");
        } System.out.println();
        sc.close();
        kadane(Array);
        
    }
    
}
