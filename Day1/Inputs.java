import java.util.*;
public class Inputs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); //making scanner
        System.out.println("Enter first integer number: ");
        int a = sc.nextInt();
        System.out.println("Enter second integer number");
        int b  = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of the two integer numbers is : ");
        System.out.println(sum);
        sc.close();
    } 
}
