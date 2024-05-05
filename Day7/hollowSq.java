import java.util.Scanner;

public class hollowSq {
    public static void op(int trows, int tcols){
        for(int i=1;i<=trows;i++){
            for(int j=1;j<=tcols;j++){
                if(i==1 || i==trows || j==1 || j==tcols){
                    System.out.print(" * ");
                }
                else{
                    System.out.print(" @ ");
                }
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimentions of square");
        System.out.print("Enter side : ");
        int n = sc.nextInt();
        op(n, n);
        sc.close();
    }
}
