package Day6;
import java.util.*;
public class Swapfn {
    public static void swapFunction(int a, int b){
    int temp = a;
    a = b;
    b = temp;
    System.out.println();
    System.out.println("Swapped Values are :-");
    System.out.println("A = "+a);
    System.out.println("B = "+b);

    } //The code represent CALL BY VALUE
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers for swaping");
        System.out.print("A = ");
        int a = sc.nextInt();
        System.out.print("B = ");
        int b = sc.nextInt();
        swapFunction(a,b);



        sc.close();

    }
}
