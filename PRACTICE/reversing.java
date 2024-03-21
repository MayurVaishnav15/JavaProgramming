import java.util.*;
public class reversing {
    public static void main(String[] args) {
        System.out.print("Enter Number you want to Reverse : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int reverse = 0;
        for(int i =1;a!=0;){
            int b;
            b = a%10;
            reverse = reverse * 10 + b;
            a = a/10;
            i = i+1; //to overcome warning of compiler
        } System.out.println("The Reverse of a number is : " + reverse);
        sc.close();
    }
}