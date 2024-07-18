import java.util.Scanner;

public class ButterFPatterns {
    public static void ButterFlyPattern(int n){
        for(int i=1;i<=n;i++){
            //stars- i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Spaces- 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars- i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){ 
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
        ButterFlyPattern(n);

        sc.close();
    }
    
}

