public class TypeProm {
    public static void main(String[] args) {
        byte a = 2;
        // a = a*2;                    //this will be error due to Type Promotion in Java because when we do operation, datatype of answer value changes to int autometically
        a = (byte)(a*2);               //can be resolved by type casting 
        System.out.println(a);       
    }
    
}
