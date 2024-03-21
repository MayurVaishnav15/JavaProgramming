import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        System.out.println("Ready");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        // int factorial=1;
        // for(int i=1;i<=number;i++){
        //     factorial=factorial*i;
        // }
        // System.out.println(factorial);
        int factorial=1;
        for(int i=number;i>0;i--){
            factorial*=i;
        }
        System.out.println(factorial);
        sc.close();
    }}
