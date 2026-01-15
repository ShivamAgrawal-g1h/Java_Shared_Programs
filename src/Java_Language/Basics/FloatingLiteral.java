package Java_Language.Basics;
class FloatingLiteral {
    public static void main(String[] args) {
        //By default, floating-point literals are of double type.
        // To assign them to a float, use the suffix f or F. You may optionally use d or D for double.

        //1. Decimal literal
        float a = 32.29f;
        float b = 0129.28f;
        float c = 1e3f;//1e3 is scientific notation, which means: 1e3 = 1×10^3 = 1,000, it's still a base-10 (decimal) number
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //2. Java DOES support hexadecimal floating-point literals(since Java 5),
        //(but all floats/doubles are still binary IEEE-754 values.)
        // Java allows floating-point literals in base-16 using this syntax:
        // 0x<hex_digits>.<hex_digits>p<decimal_exponent>
        double d = 0x1.a8p3;   // valid
        System.out.println(d);

    }
}
