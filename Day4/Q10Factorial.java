import java.util.Scanner;
public class Q10Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int a = sc.nextInt();
        int factorial = 1;
        for(int i = a;i>0;i--){
            System.out.print(i + " x ");
            factorial *= i;     
        } 
        System.out.println("\n");
        System.out.println("The Factorial Of a given Number is : "+factorial);
        sc.close();
    }
}
