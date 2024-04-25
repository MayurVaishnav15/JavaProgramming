import java.util.Scanner;
public class Q2SqArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of square : ");
        int side = sc.nextInt();
        int Area = side * side;
        System.out.println("Area of square is : ");
        System.out.println(Area);
        sc.close();
        
    }
}
    
