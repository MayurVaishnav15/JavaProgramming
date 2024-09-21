import java.util.Scanner;

public class pracRainwater {
    public static void trappingRainWater(int array[]){
        int leftMax[] = new int[array.length];
        leftMax[0]= array[0];
        for(int i=1;i<array.length;i++){
            leftMax[i]= Math.max(leftMax[i-1],array[i]);
        }
        int rightMax[] = new int[array.length];
        rightMax[array.length-1]=array[array.length-1];
        for(int i = array.length-2;i>=0;i--){
            rightMax[i]= Math.max(rightMax[i+1], array[i]);
        }
        int trappedWater=0;
        for(int i=0;i<array.length;i++){
           int  WaterLevel= Math.min(leftMax[i], rightMax[i]);
           trappedWater+= WaterLevel-array[i];
        }
        System.out.println();
        System.out.println(trappedWater);
        
    }
    public static void main(String args[]){
        System.out.print("Enter your Array size :- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.print("Enter Your Array :- ");
        for(int i=0;i<array.length;i++){
            array[i]= sc.nextInt();
        }sc.close();
        System.out.println("Your Array is :- ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+", ");
        }
        trappingRainWater(array);
    }
    
}
