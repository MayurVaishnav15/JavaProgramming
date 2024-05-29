import java.util.Scanner;
public class thePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean result = true;
        System.out.print("Enter Your Number : ");
        int number = sc.nextInt();
        if(number==2){
            System.out.println("The Number is Prime ");
        }
        else{
            for(int i = 2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    result = false;
                }
            }
            if(result==true){
                System.out.println("The number is prime");
            }
            else{
                System.out.println("The number is not prime");
            }
        }
        sc.close();
    }
}
