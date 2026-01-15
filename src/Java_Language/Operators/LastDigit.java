package Java_Language.Operators;

class LastDigit {
    public static void main(String[] args) {
        int n = -98562;// n%10 = -2
        int lastDigit = n%10;
        if(lastDigit<0) lastDigit += 10;
        //int lastDigit = Math.abs(n%10);
        System.out.println(lastDigit);
    }
}
