public class Operators {
    public static void main(String[] args) {

        // Artihmetic Operator => +, -, *, /, %

        // Addition
        int $num1 = 5;
        int $num2 = 7;

        int $result = $num1 + $num2;

        System.out.println($result);

        // Subtraction
        int $num3 = 14;
        int $num4 = 3;

        int $result1 = $num3 - $num4;

        System.out.println($result1);

        // Multiplication
        int $num5 = 28;
        int $num6 = 79;

        int $result2 = $num5 * $num6;

        System.out.println($result2);

        // division - it will give only quotient value
        int $num7 = 43;
        int $num8 = 82;

        int $result3 = $num7 / $num8;

        System.out.println($result3);

        // Modulus - it will give only Remainder value
        int $num9 = 22;
        int $num10 = 912;

        int $result4 = $num9 % $num10;

        System.out.println($result4);




        //Assignment Operators => +=, -=, *=, /=, %=, !=

        int a1 = 30;

        // a1 = a1 + 4; for using alternatives

        a1 += 4;
        a1 -= 98;
        a1 *= 76;
        a1 /= 42;
        a1 %= 21;

        // also we do increments a1++ this will increment by 1
        a1++;

        System.out.println(a1);


        // Relational Operator => <, >, <=, >=, ==
        // this will return Boolean value

        int $rel1 = 678;
        int $rel2 = 499;

        boolean $res = $rel1 > $rel2;
        boolean $res1 = $rel1 < $rel2;
        boolean $res2 = $rel1 >= $rel2;
        boolean $res3 = $rel1 <= $rel2;
        boolean $res4 = $rel1 == $rel2;
        boolean $res5 = $rel1 != $rel2;

        System.out.println($res);
        System.out.println($res1);
        System.out.println($res2);
        System.out.println($res3);
        System.out.println($res4);
        System.out.println($res5);



        // Logical Operator => OR(||) - Any one condition, AND(&&) - All Condition Must, NOT(!)

        int $log1 = 230;
        int $log2 = 724;

        boolean $resultLog = $log1 >= $log2 && $log1 == $log2;
        boolean $resultLog1 = $log1 >= $log2 || $log1 == $log2;

        System.out.println($resultLog);
        System.out.println($resultLog1);



        // Unary Operator
        // Increment (++) and Decrement (--)

        // Post Increment => x++ => first assign the value and later will update adding by 1
        // Pre Increment => ++x => first increment adding 1 and after assign the value

        // Post Decrement => x++ => first assign the value and later will update Decrease
        // by 1
        // Pre Decrement => ++x => first Decrease by 1 and after assign the value


        int $UnaryOperator = 278;

        $UnaryOperator++; //Post Increment
        $UnaryOperator--; //Post Decrement
        ++$UnaryOperator; //pre Increment
        --$UnaryOperator; //Pre Decrement

        System.out.println($UnaryOperator);
    }
}
