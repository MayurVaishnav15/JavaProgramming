import java.util.*;
public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter the nubmer till you want sum : ");
        int number = sc.nextInt();
        for(int i = 1;i<=number;i++){
            sum = sum + i;
        }
        System.out.println("The sum is : "+sum);
        sc.close();
    }
}
