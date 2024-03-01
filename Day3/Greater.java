import java.util.*;
public class Greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value1 : ");
    int a = sc.nextInt();
    System.out.print("Enter value2 :");
    int b = sc.nextInt();
    if(a>b){
        System.out.println("a is greater that is " + a);
    }
    else{
        System.out.println("b is greater that is " + b);
    }
    sc.close();
    }
    
}
