package Day5;

import java.util.*;
public class InvStr {
    public static void main(String[] args) {
        System.out.println("ready");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lines for stars : ");
        int n = sc.nextInt();
        for(int i =1 ; i<=n; i++){
            for(int j=1; j<=n-i+1;j++){
                System.out.print(" * ");
            }
            System.err.println();
        }sc.close();
    }
    
}
