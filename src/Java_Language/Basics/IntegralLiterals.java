package Java_Language.Basics;

class Literals {
    public static void main(String[] args) {
        //decimal
        int x1 = 101;
        System.out.println(x1);
        // The octal number should be prefix with 0.
        int x2 = 0145;
        System.out.println(x2);
        // The hexa-decimal number should be prefix with 0X or 0x.
        int x3 = 0X65;
        System.out.println(x3);
        //1.4. Binary literals: From 1.7 onward, we can specify
        // literal value even in binary form also, allowed digits are 0 and 1.
        // Literals value should be prefixed with 0b or 0B.
        int x4 = 0b1100101;
        System.out.println(x4);
        //Note: By default, every integral literal is of int type.
        // To specify it as long, add the suffix L or l.
        // There’s no explicit way to define byte or short literals,
        // but if an integral value assigned is within their range,
        // the compiler treats it automatically as a byte or short literal.
    }
}
