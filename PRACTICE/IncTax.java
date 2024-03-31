import java.util.*;
public class IncTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Annual Income : ");
        float income = sc.nextFloat();
        if(income<500000){
            System.out.println("You don't need to pay tax.");
        }
        else if(income>500000 && income<1000000){
            System.out.println("You need to pay Tax of Rupees " + ((income/100)*20));
        }
        else{
            System.out.println("You need to pay Tax of Rupees " + ((income/100)*30));
        } 
        sc.close();
    }
}
