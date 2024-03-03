import java.util.Scanner;
public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1 ;true;i++){
            System.out.print("Enter your number : ");
            int a = sc.nextInt();
            if(a%10==0){
                break;
            } System.out.println(a);
        }System.out.println("Multiple of 10 found!!!....Loop Exited");
        sc.close();
    }
}
