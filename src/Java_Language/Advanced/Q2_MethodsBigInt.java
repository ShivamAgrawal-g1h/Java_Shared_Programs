package Java_Language.Advanced;
import java.math.BigInteger;
class Q2_MethodsBigInt {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("10");
        b = b.remainder(BigInteger.valueOf(4));
        System.out.println(b);
        b = b.pow(4);
        System.out.println(b);
        b = b.mod(BigInteger.valueOf(12));
        System.out.println(b);
        System.out.println(b.isProbablePrime(100));
        System.out.println(b.nextProbablePrime());

    }
}
