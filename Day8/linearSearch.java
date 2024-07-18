import java.util.Scanner;
public class linearSearch {
    public static int LinearSearch(int numbers, int key){
        for(int i=0;i<10;i++){
            if(numbers==key){
                return 1;
            }      
        }
        
        return -1;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
        System.out.println("Enter Array Elements :-");
        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        System.out.print("The Array is : ");
        for(int i = 0; i<numbers.length;i++){ 
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        System.out.print("Enter number you want to Search : ");
        // int key = sc.nextInt();
        int index = LinearSearch(0, 0);
        System.out.println(index);
        // if(index==1){
        //     System.out.print("found at Index  : ");
        // }
        // else{
        //     System.out.println("Not Found");
        // }
        sc.close();
    }
    
}
