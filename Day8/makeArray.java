import java.util.Scanner;

public class makeArray {
    public static void makingArray(){
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Array[] = new int[10];
        for(int i = 0; i<Array.length;i++){
            Array[i] = sc.nextInt();
            System.out.print(Array[i]+ " ");
        }
        
        sc.close(); 
    }
}
