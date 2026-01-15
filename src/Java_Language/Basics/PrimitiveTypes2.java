package Java_Language.Basics;
class PrimitiveTypes2 {
    public static void main(String[] args) {
        byte a = 126; // 1 byte size
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;// It overflows here because byte range is from -128 to +127
        System.out.println(a);
        a++;
        System.out.println(a);

        short b = 32767; // 2 byte size
        System.out.println(b);
        b++; // overflows
        System.out.println(b);
        b--; // again overflows in reverse direction as of the previous
        System.out.println(b);

        int c = 271; // 3 byte size
        long d = 2383; // 4 byte size
    }
}
