import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = sc.nextInt();
        if(number%2 == 0){
            System.out.println("The number is EVEN");
        }
        else{
            System.out.println("The number is ODD");
        }
        sc.close();

        
    }
}
