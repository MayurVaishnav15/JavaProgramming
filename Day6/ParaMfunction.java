package Day6;
import java.util.Scanner;

public class ParaMfunction {
    public static int CalculateSum(int firstValue,int SecValue){     //Formal Parameters
        int sum = firstValue+SecValue;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second value: ");
        int b = sc.nextInt();
        int sum = 0;
        sum = CalculateSum(a,b);                                    //Arguments OR actual Parameters
        System.out.println("The Sum is: "+sum);
        sc.close();
    }
}
