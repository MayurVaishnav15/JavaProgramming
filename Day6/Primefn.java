import java.util.*;

public class Primefn {

    public static boolean Prime(int n ){
        boolean isPrime = true;
        if(n==2){
            return true;
        }
        
        for(int i = 2 ; i<=n-1;i++){
            if(n%i == 0 ){
                return false;          
            }
        }return isPrime;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        boolean result = Prime(n);
        if(result == false){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
        sc.close();

      
    }
}
