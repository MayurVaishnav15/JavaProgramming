import java.util.*;
public class PrRange {
    public static boolean Prime(int a){
        boolean isPrime = true;

        for(int i = 2; i<=a-1;i++){
            if(a%i==0){
                return false;
                
            }
        }return isPrime;
    }


    public static void checkPrime(int n){
        for(int i=2;i<=n;i++){
            if(Prime(i)){
               System.out.print(i+" ");
            }
        }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        checkPrime(n);
        sc.close();
    }
    
}
