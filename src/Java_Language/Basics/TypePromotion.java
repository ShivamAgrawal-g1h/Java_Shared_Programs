package Java_Language.Basics;
class TypePromotion {
    public static void main(String[] args) {
        // Declaring and initializing primitive types
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;

        // The Expression
        double result = (f * b) + (i / c) - (d * s);

        // Printing the result obtained after
        // all the promotions are done
        System.out.println("result = " + result);
        //Explicit Typecasting : Works with both compatible and incompatible(Larger type to smaller type) types.
        //                       May result in data loss (e.g., truncation).
        byte x = 50;
        // x = x*2; this will give incompatible type found compile time error
        x = (byte)(x*2);
    }
}
/*
    Type Promotion in Expresion
While evaluating expressions, the result is automatically updated to a larger data type
of the operand,
Since, the intermediate value may exceed the range of operands
and hence the expression value will be promoted. Some conditions for type promotion are:

1. Java automatically promotes each byte, short, or char operand to int
   when evaluating an expression.
2. If one operand is long, float or double the whole expression is promoted to long,
   float, or double respectively.
 */