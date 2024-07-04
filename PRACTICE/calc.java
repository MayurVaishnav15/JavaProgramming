import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your number : ");
       int counter = 0;
       int n = sc.nextInt();
       do{
        System.out.print(counter + " ");
        counter++;

       }while(counter<=n);
       sc.close();

    }
    
}
