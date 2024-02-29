import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.println("Enter radius of a Circle : ");
        Scanner sc = new Scanner(System.in);
        float radius = (float)sc.nextFloat();
        float pi = 3.14f;
        float AREA = pi * radius * radius;
        System.out.println("The radius of circle is :  2");
        System.out.println(AREA);
        sc.close();
    }
}
