import java.util.*;
public class pracInsSort {
    public static void InsertionSorting(int Array[]){
        for(int i =1;i<Array.length;i++){
            int curr= Array[i];
            int prev=i-1;
            while (prev>=0 && Array[prev]>curr) {
                Array[prev+1]=Array[prev];
            }
            //Insertion
            Array[prev+1]=curr;
        }
        
        }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array : ");
        int n = sc.nextInt();
        int Array[]= new int[n];
        System.out.print("Enter Your Array : ");
        for(int i=0;i<Array.length;i++){
            Array[i]=sc.nextInt();
        }
        System.out.print("Your Unsorted Array : ");
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i] + ", ");
        }sc.close();
        InsertionSorting(Array);
        
        }
    }