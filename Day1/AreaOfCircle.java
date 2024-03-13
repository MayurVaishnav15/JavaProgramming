import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.print("Enter radius of a Circle : ");
        Scanner sc = new Scanner(System.in);
        float radius = (float)sc.nextFloat();
        float pi = 3.14f; //because default 3.14 will be taken as double and not float
        float AREA = pi * radius * radius;
        System.out.print("The radius of circle is :  ");
        System.out.println(AREA);
        sc.close();
    }
}
