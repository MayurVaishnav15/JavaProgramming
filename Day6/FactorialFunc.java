import java.util.Scanner;

public class FactorialFunc {

    public static int factorialClass(int n){
        int f=1;
        for(int i = 1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println("Enter your value to calculate Factorial: ");
        Scanner sc = new Scanner(System.in);
        int F = sc.nextInt();
        System.out.println(factorialClass(F));
        sc.close();
    }
    
}
