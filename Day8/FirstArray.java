import java.util.Scanner;

public class FirstArray {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks : ");
        marks[0] = sc.nextInt();
        System.out.print("Enter Chemistry marks : ");
        marks[1] = sc.nextInt();
        System.out.print("Enter Maths marks : ");
        marks[2] = sc.nextInt();
        System.out.println("");

        System.out.println("Physics Marks : " + marks[0]);
        System.out.println("Chemistry Marks : " + marks[1]);
        System.out.println("Maths Marks : " + marks[2]);
        sc.close();

        // int numbers[] = {1, 2, 3};
        // String fruits[] = {"apple", "fruits", "orange"};
        // System.out.println(marks);
        // System.out.println(numbers);
        // System.out.println(fruits);


        


    }
}
