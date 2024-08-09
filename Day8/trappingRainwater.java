import java.util.Scanner;

public class trappingRainwater {
    public static int RainWaterTrapping(int Height[]){
         //Calculate left max boundary in form of Auxilary Array
         int leftMax[]= new int[Height.length];
         leftMax[0]=Height[0];
         for(int i = 1;i<Height.length;i++){
            leftMax[i]= Math.max(Height[i],leftMax[i-1]);
         }
         //Calculate right max boundary in form of Auxilary Height
         int rightMax[]= new int[Height.length];
         rightMax[Height.length-1]=Height[Height.length-1];
         for(int i = Height.length-2;i>=0;i--){
            rightMax[i]=Math.max(Height[i],rightMax[i+1]);
         }
         //loop
         int trapRainwater=0;
         for(int i=0;i<Height.length;i++){
            //waterLevel = min(leftmax boud, rightmax bound)
            int waterLevel = Math.min(leftMax[i],rightMax[i]);

            //trappedWater=waterLevel-height[i]
            trapRainwater+=waterLevel-Height[i];
         }
         return trapRainwater;   
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter size of your Array :- ");
        int n = sc.nextInt();
        System.out.print("Enter your Heigh:-  ");
        int Height[]= new int[n];
        for(int i=0;i<Height.length;i++){
            Height[i]=sc.nextInt();
        }System.out.print("The Height is :-  ");
        for(int i=0;i<Height.length;i++){
            System.out.print(Height[i]+", ");
        }sc.close();
        System.out.println();
        System.out.print("The trapped RainWater is :- "+RainWaterTrapping(Height)); 
    } 
}
