import java.util.*;
public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1 : ");
        float a = sc.nextFloat();
        System.out.println("Enter number2 :");
        float b = sc.nextFloat();
        float prod = a*b;
        System.out.print("The product of above numbers is: " + prod);
        sc.close();
        
    }
    
}
