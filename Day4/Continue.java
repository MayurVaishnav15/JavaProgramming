import java.util.*;
public class Continue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){       
            System.out.print("Enter your number : ");
            int num = sc.nextInt();
            if(num%10==0){
                continue; //loop exits and restart if number is multiple of 10
            }
            System.out.println("Your number is "+num);         
            // sc.close(); //remove this line before actually implementing the code : case of exception handling
        }
    } 
}
