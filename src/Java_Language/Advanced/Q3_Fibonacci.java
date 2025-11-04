package Java_Language.Advanced;
import java.math.BigInteger;
class Q3_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
    public static BigInteger fibo(int n){
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c;
        for(int i=0; i<n-1; i++){
            c = a.add(b);
            a = b;
            b = c;
        }
        return b;
    }
}
