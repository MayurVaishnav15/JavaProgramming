import java.util.Scanner;
public class MultOf10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1 ;true;){
            System.out.print("Enter your number : ");
            int a = sc.nextInt();
            if(a%10==0){
                break;
            } System.out.println(a);
            i=i+1;
        }System.out.println("Multiple of 10 found!!!....Loop Exited");
        sc.close();
    }
}
