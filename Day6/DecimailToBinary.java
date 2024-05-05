import java.util.Scanner;
public class DecimailToBinary {
    public static void Processing(int decNum){
    int name = decNum;
     int power = 0;
     int binNum = 0;
     while(decNum>0){
        int rem = decNum%2;
        binNum = binNum + rem*(int)Math.pow(10, power);
        power++;
        decNum=decNum/2;
     }System.out.println("The decimal of "+name + " is " + binNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Decimal number : ");
        int n = sc.nextInt();
        Processing(n);
        sc.close();
    }
}
