import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of subject1 : ");
        float a = sc.nextInt();
        System.out.println("Enter marks of subject2 : ");
        float b = sc.nextInt();
        System.out.println("Enter marks of subject3 : ");
        float c = sc.nextInt();
        float avg = (a+b+c)/3;
        System.out.println("The average marks of all subjects is : ");
        System.out.println(avg);
        sc.close();


    }
    
}
