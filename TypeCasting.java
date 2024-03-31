public class TypeCasting {
   
    public static void main(String[] args) {
        // type Conversion

        // Converting small datatype value into larger datatype value - Type Conversion
        // This will done implicitly by compiler

        byte num1 = 20;
        int num2 = num1;

        System.out.println(num2);



        // type Casting
        // Converting larger datatype value into smaller datatype value - Type Casting
        // This will explicitly done by the programmer

        float $number = 89.023f;
        int $number1 = (int) $number;

        System.out.println($number1);


        // type promotion
        // when the value reach out of range datatype it will automatically converts into another datatype
        

        byte b1 = 20;
        byte b2 = 50;

        int b3 = b1 * b2;

        System.out.println(b3);
    

    }

    
}

