import java.util.Scanner;
public class TernaryOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value : ");
        int a = sc.nextInt();
        String Answer = (a%2==0)?"EVEN":"ODD";
        System.out.println(Answer);
        sc.close();
    }
    
}
