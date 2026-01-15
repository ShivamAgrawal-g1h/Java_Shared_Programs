package Java_Language.Basics;

class SwapTwoNumbers {
    public static void main(String[] args) {
        //Method-1 : Using a temporary variable
        int m = 9,n = 20;
        int temp = m;
        m = n;
        n = temp;
        System.out.println("Value of m is : "+m+" and n is : "+n);

        //Method-2 : Using two variables
        //m = m+n;
        //n = m-n;
        //m = m-n;

        // Method-3: Using two variables(single line)
        // m = m + n - (n = m);

        // Method-4 : Using XOR operator
        // a = a^b;
        // b = a^b;
        // a = a^b;
    }
}
