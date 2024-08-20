public class SSort {
    public static void sorting(int Arr[]){
        for(int i=0;i<Arr.length;i++){
            int minPos=i;
            for(int j =minPos+1;j<Arr.length;j++){
                if(Arr[minPos]>Arr[j]){
                    minPos=j;
                }
                int temp=Arr[minPos];
                Arr[minPos]=Arr[i];
                Arr[i]=temp;
            }
        }
        for(int i=0;i<Arr.length;i++){
            System.out.print(Arr[i]+", ");
        }
    }
    public static void main(String[] args) {
        int Arr[]={3,4,2,6,7};
        sorting(Arr);
    }
    
}
