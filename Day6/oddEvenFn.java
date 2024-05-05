import java.util.Scanner;

public class oddEvenFn {
    public static boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        sc.close();
        if (isEven(a)) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

}
