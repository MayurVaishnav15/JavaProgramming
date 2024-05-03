public class contPy {
    public static void main(String[] args) {
        System.out.println("ready");
        char ch = 'A';
        for(int i =1; i<=4; i++){
            for(int j=1; j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
