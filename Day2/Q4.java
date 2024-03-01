public class Q4 {
    public static void main(String[] args){
    int x = 2, y = 5;
    int exp1 = (x * y / x);
    int exp2 = (x * (y / x)); // single slash division make division int so here ans of division will be 2 and not 2.5
    System.out.print(exp1 + " ,");
    System.out.print(exp2);
    }
}