package Java_Language.Operators;
class BitShiftOperators {
    public static void main(String[] args) {
        int x = -1;
        System.out.println(x<<1);
        System.out.println(x<<3);
        System.out.println(x<<8);
        System.out.println(x<<9);
        System.out.println(x<<32);// remember edge cases(RUN THE CODE)
        System.out.println(x<<33);
    }
}
