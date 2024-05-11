import java.util.*;
public class callByRef {
    public static void updateSection(int marks[], int nonchangeable){
        nonchangeable = 100;
        for(int i =0; i<marks.length;i++){
            marks[i] = marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]= new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i= 0;i<marks.length;i++){
            System.out.print("Enter number : ");
            marks[i]=sc.nextInt();
        }
        int nonchangeable = 10;
        updateSection(marks, nonchangeable);
        System.out.println("The nonChangeable value is : "+ nonchangeable);
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);  
        } sc.close();
    }




    
}

   