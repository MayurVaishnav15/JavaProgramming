import java.util.Scanner;

public class Averagefn {
    public static int Avg(int a, int b, int c){
        return((a+b+c)/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        System.out.println("The average of " +a+", "+b+", "+c+" is equal to "+Avg(a, b, c)); 
        sc.close();
    }
    
}
