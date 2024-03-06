import java.util.*;
public class ProductFunc{
    public static int Product(int a, int b){
        int prod = a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value1 : ");
        int a = sc.nextInt();
        System.out.print("Enter value2 : ");
        int b = sc.nextInt();
        int product = Product(a, b);
        System.out.println("The Product is : " +product);
        sc.close();

    }
}