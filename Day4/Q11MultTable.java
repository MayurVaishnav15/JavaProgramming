// import java.util.Scanner;

// public class Q11MultTable {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number for getting it's Multiplication Table : ");
//         int n = sc.nextInt();
//         int Table=0;
//         for(int i =1;i<=10;i++){
//             Table = n*i;
//             System.out.println(n+"*" + i + " = " +Table);
//         }sc.close();
//     }
    
// }
import java.util.Scanner;
class Q11MultTable{
    public static void main(String args[])
    {
        System.out.println("enter your number");
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(N+" x "+i+" = "+N*i);
        }
        sc.close();
    }
}

