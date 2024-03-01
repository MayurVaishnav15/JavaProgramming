import java.util.*;
public class Add {
    public static void main(String[] args) {
        System.out.println("ready");
        Scanner sc = new Scanner(System.in);
        System.out.println("Give value1 :-");
        int a = sc.nextInt();
        System.out.println("Give value2 :-");
        int b = sc.nextInt();
        System.out.println("The sum of two inputs is : " +  (a+b));
        sc.close();
    }
    
}
