package Day5;

import java.util.*;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){                     // i is used for lines.
            for(int j=1;j<=i;j++)
            System.out.print("*");
            System.out.print("\n");
        }
        sc.close();
    }
}