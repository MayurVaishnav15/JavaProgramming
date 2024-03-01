package Day3;
import java.util.*;
public class If_Else {
    public static void main(String args[]){
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>18){
            System.out.println("ADULT");
        }

        else if(age<18 && age>13) {
            System.out.println("Teenager");
        }

        else{
            System.out.println("Child");
           
        }
        sc.close();
    }
}
