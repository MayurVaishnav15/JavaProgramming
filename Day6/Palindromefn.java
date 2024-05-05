import java.util.Scanner;
public class Palindromefn {
    
    public static int Palindrome(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev *10 + (rem);
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check : ");
        int n = sc.nextInt();
        if(n==Palindrome(n)){
            System.out.println("Yes, number is palindrome.");
        }else{
            System.out.println("No, number is not Panlindrome");
        }
        sc.close();
    }
}
