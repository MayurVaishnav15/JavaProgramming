import java.util.Scanner;

public class prefixSum {
    public static void SumPrefix(int Array[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int pSum[] = new int[Array.length];
        pSum[0]= Array[0];
        for(int i =1;i<Array.length;i++){
           pSum[i]=pSum[i-1]+Array[i]; 
        }System.out.println();
        System.out.print("The Prefix Sum is "+pSum[0]+", ");
        for(int i =1;i<Array.length;i++){
           System.out.print(pSum[i]+", ");
        }
        for(int i=1;i<Array.length;i++){
            int start=i;
            for(int j=i;j<Array.length;j++){
                int end= j;
                currSum= start==0?pSum[end]:pSum[end]-pSum[start-1];
                if(maxSum<currSum){
                maxSum=currSum; 
                }
            }
        }System.out.println(maxSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of your Array:- ");
        int n = sc.nextInt();
        System.out.print("Enter your array:-  ");
        int Array[] = new int[n];
        for(int i = 0;i<Array.length;i++){
            Array[i]=sc.nextInt();
        }System.out.print("The Array is :-  ");
        for(int i = 0;i<Array.length;i++){
            System.out.print(Array[i]+", ");
        }
        sc.close();
        SumPrefix(Array);
    }
}
