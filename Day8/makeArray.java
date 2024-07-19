import java.util.Scanner;

public class makeArray {
    public static void makingArray(){
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Array[] = new int[10];
        System.out.println("Enter Your Array List :- ");
        for(int i = 0; i<Array.length;i++){
            Array[i] = sc.nextInt();
        }
        sc.close(); 
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i] + " ");
        }
    }
}
