import java.util.*;
public class Q3GST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price of Pensil:");
        float Pensil = sc.nextFloat();
        System.out.println("Enter price of Pen: ");
        float Pen =  sc.nextFloat();
        System.out.println("Enter price of Eraser");
        float Eraser = sc.nextFloat();
        float gst = ((Pensil + Pen + Eraser)/100)*18;
        float Total_Bill = (Pensil+Pen+Eraser)+gst;       //Bill with GST of 18%
        System.out.println(Total_Bill);
        sc.close();
    }
    
}
