import java.util.Scanner;
public class Switch_Case {
    public static void main(String[] args) {
        System.out.println("FOOD MENU");
        System.out.println("1.BURGER");
        System.out.println("2.PIZZA");
        System.out.println("3.JUICE");
        System.out.println("4.TEA");
        System.out.println("5.COFFEE");
        System.out.print("SELECT THE NUMBER OF YOUR CHOISE :-  ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch(a){
            case 1 : System.out.println("Burger Ordered...Thank You ");break;
            case 2 : System.out.println("Pizza Ordered...Thank You");break;
            case 3 : System.out.println("Juice Ordered...Thank You");break;
            case 4 : System.out.println("Tea Ordered...Thank You");break;
            case 5 : System.out.println("Coffee ordered...Thank You");break;
            default : System.out.println("Try Again...Invalid Order Number...");
        }
        sc.close();

    }
}
