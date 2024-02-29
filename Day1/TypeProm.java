public class TypeProm {
    public static void main(String[] args) {
        byte a = 2;
        // a = a*2;                    //this will be error due to Type Promotion in Java
        a = (byte)(a*2);                       
        System.out.println(a);        //can be resolved by type casting 
    }
    
}
