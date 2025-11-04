package Java_Language.Advanced;
import java.math.BigInteger;
class ConverionBigInt {
    public static void main(String[] args) {
        BigInteger A = new BigInteger("77");
        int a = A.intValue();
        //Convert to int: Converts BigInteger to an int. (Ensure the value fits within int limits.)
        long b = A.longValue();
        String z = A.toString();
    }
}
