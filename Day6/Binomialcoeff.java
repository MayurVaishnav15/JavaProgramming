package Day6;

import java.util.*;

public class Binomialcoeff {

     public static int factorial(int n){
        int fact = 1 ;
        for(int i=1;i<=n;i++){
            fact = fact*i;

        }
        return fact;
        
     }
     public static int BinCoeff(int n, int r){
      
        int facta = factorial(n);
        int factr = factorial(r);
        int factnmr = factorial(n-r);
        int result = facta/(factr*factnmr);
        return result;

     }
    public static void main(String[] args) {  //formula  nCr = n! / r!*(n-r)!
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r for nCr Binomial :-");
        System.out.print("n = ");
        int n = sc.nextInt();
        System.out.print("r = ");
        int r = sc.nextInt();
        int result = BinCoeff(n, r);
        System.out.println(result);
    
        sc.close();
    }
    
}
