public class DataTypes {
    public static void main(String[] args) {
        byte B = 127; //127 is max range of bite and so cannot excede it & -128 is minimum.
        System.out.println(B);

        char ch = 'A'; //for character single only
        System.out.println(ch); 

        boolean BL = true; //for true and false only
        System.out.println(BL);

        int number = 25;                        //The range of int goes from -2,147,483,648 to 2,147,483,647
        System.out.println(number);

        long numbers = 18;                      //The range of long goes from 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        System.out.println(numbers);
        
         float numb1 = 2.4f;                    //method 1 to solve float error because in java
         System.out.println(numb1);             //decimal number is considered default as float

         float numb2  = (float)2.4;             //This is TYPECASTING where we typeCast default double to float      
        System.out.println(numb2);
        
         double numbs = 2.443;
         System.out.println(numbs);

    }
    
}

