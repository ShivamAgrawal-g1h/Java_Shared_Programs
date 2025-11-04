package Java_Language.Advanced;
import java.math.BigInteger;
class BigInt {
    public static void main(String[] args) {
        //1. Using a String literal
        BigInteger b = new BigInteger("777");
        //2. Using a String variable
        String str = "-8812";
        BigInteger b2 = new BigInteger(str);
        //3. Using primitive data types (int, long)
        int n = 273;
        BigInteger b3 = BigInteger.valueOf(85+n);
    }
}
