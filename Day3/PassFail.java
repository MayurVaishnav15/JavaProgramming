import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
        System.out.print("Enter Your Marks : ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String Results = marks>36?"Pass":"Fail";
        System.out.println(Results);
        sc.close();
        
    }
    
}
