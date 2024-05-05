import java.util.Scanner;
public class SumOfDigit {
    public static void op(int n){
        int digitSum = 0;
        while(n>0){

            int rem = n%10;
            digitSum = digitSum + rem;
            n=n/10;
        }
        System.out.print(digitSum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();
        op(n);
        sc.close();
    }
}
