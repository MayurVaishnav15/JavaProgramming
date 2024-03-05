package Day5;
import java.util.*;
public class StarP {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int A =0;
        do{
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.print(" * ");
                }
                System.out.print("\n");
            }
            for(int i=1;i<=n;i++){                     // i is used for lines;
                for(int j=1;j<=i;j++)                  // j is used for stars;
                System.out.print(" * ");
                System.out.print("\n");
                
            }A++;
        }while(A<=3);
       
        sc.close();
    }
    
}
