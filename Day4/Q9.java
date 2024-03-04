// import java.util.*;
// public class Q9 {
//     public static void main(String args[]) {
//     Scanner sc = new Scanner(System.in);
//     int evenSum =0,oddSum=0;
//     for(int i=1;true;i++){
//     System.out.print("Enter your number: ");
//     int num = sc.nextInt();
//     System.out.print("Enter your choice: ");
//             int choice = sc.nextInt();
//     if(choice==1){ 
//         if(num%2==0){
//                 evenSum = evenSum+num;
//             }
//             else {
//                 oddSum=oddSum+num;
//             } 
            
//         }
//         System.out.println("The Sum Of Odd Digits is : "+oddSum);
//         System.out.println("The Sum Of Even Digits is : "+evenSum);
//         }
//     }
//     }

import java.util.*;
public class Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum =0,oddSum=0, choice =0;
        do{System.out.print("Enter your Number: ");
            int num = sc.nextInt();
            if(num%2==0){
                evenSum+=num;
            }
            else{
                oddSum+=num;
            }
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
        }while(choice==1);
        System.out.println("The sum of even Numbers is : "+evenSum);
        System.out.println("The sum of odd Numbers is : "+oddSum);
        sc.close();
    }
}
    









































































// import java.util.Scanner;
// public class Q9 {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int number;
// int choice;
// int evenSum = 0;
// int oddSum = 0;
// do {
// System.out.print("Enter the number ");
// number = sc.nextInt();
// if( number % 2 == 0) {
// evenSum += number;
// } else {
// oddSum += number;
// }
// System.out.println("Do you want to continue? Press 1 for yes or 0 for 1no");
// choice = sc.nextInt();
// } while(choice==1);
// System.out.println("Sum of even numbers: " + evenSum);
// System.out.println("Sum of odd numbers: " + oddSum);
// }
// }
