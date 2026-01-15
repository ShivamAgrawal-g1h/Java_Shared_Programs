package Java_Language.Operators;

class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5, b = 7;
        System.out.println("a&b = "+(a&b));
        System.out.println("a|b = "+(a|b));
        System.out.println("a^b = "+(a^b));
        System.out.println("~a = "+(~a));
        a &=b;
        System.out.println("a = "+a);
    }
}
