public class ReverseNo {
    public static void main(String[] args) {
        int a = 10899;
        int reverse = 0;
        for(int i =1;i<=5;i++){
            int b;
            b = a%10;
            reverse = reverse * 10 + b;
            a = a/10;
            
        } System.out.println("The Reverse of a number is : " + reverse);
    }
}
