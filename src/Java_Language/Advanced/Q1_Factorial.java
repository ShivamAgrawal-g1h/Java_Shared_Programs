package Java_Language.Advanced;
import java.math.BigInteger;
class Q1_Factorial {
    public static BigInteger Factorial(int n){
        BigInteger f = new BigInteger("1");
        for(int i=2; i<n; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
    public static void main(String[] args) {
        System.out.println(Factorial(100));
    }
}
