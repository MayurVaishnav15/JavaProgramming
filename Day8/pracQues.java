import java.util.Scanner;

public class pracQues {
    public static boolean pQuestion(int nums[]){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true; 
                }
            }
        }return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of your Array:-  ");
        int n = sc.nextInt();
        int nums[]=new int[n];
        System.out.print("Enter Your Array:- ");
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
        }sc.close();
        System.out.println(pQuestion(nums));

    }
    
}
