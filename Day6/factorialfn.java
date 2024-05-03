package Day6;
import java.util.*;
public class factorialfn {
    public static int fact(int a){
        int fact =1;
        for(int i=1;i<=a;i++){
            fact = fact*i;
        }
        return fact;
        
     
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for Factorial Calculation : ");
        int a = sc.nextInt();
        int TheFactoiral = fact(a);
        System.out.println(TheFactoiral);


        sc.close();
    }
    
}
