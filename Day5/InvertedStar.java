package Day5;
import java.util.*;
public class InvertedStar {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
        sc.close();
    }
    
}
