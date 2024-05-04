import java.util.*;
public class PrimeRange {
    public static boolean Prime(int n){
       boolean P = true;
       for(int i = 2 ;i<=n-1;i++){
        if(n%i==0){
            P = false;
        }
       }
       return P;
    }
    public static void checkPrime(int n){
        for(int i = 2;i<=n-1;i++){
            if(Prime(i)){
                System.out.print(i+ " ");
            }
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        checkPrime(a);
        sc.close();
    }
    
}
