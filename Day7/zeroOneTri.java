import java.util.Scanner;

public class zeroOneTri {
    public static void zero_One_Triangle(int n ){
        for(int i =1; i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        zero_One_Triangle(n);
        sc.close();
        
    }
    
}
