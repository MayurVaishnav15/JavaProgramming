import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        boolean c = true;
        System.out.print("Enter a number to check: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number==2){
            System.out.println("Prime");
        }
        else{
            for(int i = 2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    c = false;
                    break;  //for faster execution
                }
            }
            if(c==false){
                System.out.println("Not Prime");
            }
            else{
                System.out.println("Prime");
            }
        }
    } 
}
