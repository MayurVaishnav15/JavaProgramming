import java.util.*;
public class BinaryToDecimal {
    public static void Operations(int binNum){
    int myName = binNum;
     int pow = 0;
     int decNum = 0;
     while(binNum > 0){
        int lastDigit = binNum%10;
        decNum = decNum + (int)(lastDigit* Math.pow(2,pow));
        pow++;
        binNum = binNum/10;
     }
     System.out.println("The Decimal of " +myName + " is " + decNum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number : ");
        int n = sc.nextInt();
        Operations(n);
        sc.close();
    }
    
}
