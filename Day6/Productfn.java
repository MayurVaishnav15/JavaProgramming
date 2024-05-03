package Day6;
import java.util.*;
public class Productfn {
    public static int Multiply(int a, int b){
        int result = a*b;
        return result;
    


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter Second number : ");
        int b = sc.nextInt();
        int res =  Multiply(a, b);
        System.out.println("The Product of the numbers is : "+res);
       

        sc.close();
    }
}
