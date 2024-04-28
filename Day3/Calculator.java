import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter value1 :");
            int num1 = sc.nextInt();
            System.out.print("Enter value2 :");
            int num2 = sc.nextInt();
            System.out.print("Enter Operator : ");
            char Operator = sc.next().charAt(0);
            switch (Operator) {
                case '+' :System.out.println(num1+num2);break;
                case '-' :System.out.println(num1-num2);break;
                case '*' :System.out.println(num1*num2);break;
                case '/' :System.out.println(num1/num2);break;
                case '%' :System.out.println(num1%num2);break;
                default:System.out.println("Invalid Operator...");
                sc.close();
             } 
        }
       
    }
}
