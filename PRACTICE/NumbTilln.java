import java.util.Scanner;
public class NumbTilln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        System.out.print("Enter number : ");
        int a = sc.nextInt();
        while(counter<=a){
            System.out.print(counter + " ");
            counter++;
}
        sc.close();
    }
}
