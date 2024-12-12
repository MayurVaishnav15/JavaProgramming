import java.util.Scanner;

public class bubbleSort {
    public static void bubbleSorting(int Array[]){
        for(int turn = 0 ;turn<Array.length-1;turn++){
            for( int j =0;j<Array.length-1-turn;j++){
                if(Array[j]>Array[j+1]){
                    int temp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = temp;
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter size of Your Array : ");
        int n = sc.nextInt();
        int Array[]= new int[n]; 
        System.out.print("Enter Your Array : ");
        for(int i=0;i<Array.length;i++){
            Array[i]= sc.nextInt();
        }
        System.out.print("Your Array is :  ");
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]+" ");
        }
        bubbleSorting(Array);
        System.out.println();
        System.out.print("The Sorted Array is :  ");
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i]+", ");
        }
        sc.close();

        
        
        
        
    }
    
}
