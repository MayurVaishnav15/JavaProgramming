import java.util.*;
public class Continue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1;true;){
            System.out.print("Enter your number : ");
            int num = sc.nextInt();
            if(num%10==0){
                continue;
            }
            System.out.println("Your number is "+num);
            i = i+1;
            sc.close(); //remove this line before actually implementing the code : case of exception handling
        }
    } 
}
