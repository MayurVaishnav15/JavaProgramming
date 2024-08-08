import java.util.Scanner;
public class maxSubArray {
    public static void maxofArray(int Array[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<Array.length;i++){
            int start = i;
            System.out.println();
            for(int j=i;j<Array.length;j++){
                int end = j;
                currSum=0;
                for(int k = start;k<=end;k++){
                     System.out.print(Array[k]+", ");
                     currSum += Array[k];
                }System.out.print("   Sum="+currSum);
                System.out.println( );
                if(maxSum<currSum){ 
                   maxSum=currSum;
                }
            }System.out.println("Sub Array's maximum Sum is "+maxSum);
        }
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of your Array:- ");
        int n = sc.nextInt();
        System.out.print("Enter your Array:-");
        int Array[]= new int[n];
        for(int i = 0;i<Array.length;i++){
            Array[i] = sc.nextInt();
        }
        System.out.print("The Array is:- ");
        for(int i = 0;i<Array.length;i++){
            System.out.print(Array[i]+", ");
        }
        System.out.println();
        sc.close();
        maxofArray(Array);
    }
}
