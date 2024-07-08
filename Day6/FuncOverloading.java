import java.util.*;
public class FuncOverloading {
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a , int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First value : ");
        int a = sc.nextInt();
        System.out.print("Enter Second value : ");
        int b = sc.nextInt();
        System.out.print("Enter Third value : ");
        int c = sc.nextInt();
        System.out.println("The sum of first two number is  : " +sum(a,b));
        System.out.println("The sum of all numbers is :"+ sum(a,b,c));
        sc.close();  
    }   
}
