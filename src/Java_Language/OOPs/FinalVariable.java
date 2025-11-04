package Java_Language.OOPs;
class FinalVariable {
    // Local Variable
//    public static void main(String[] args) {
//        final int x;
//        x = 100;
//        //x = 200; // add this statement will give compilation error
//        System.out.println(x);
//    }

    // Instance Variable
//    final int x=100;
//    public static void main(String[] args) {
//        FinalVariable t = new FinalVariable();
//        System.out.println(t.x);
//    }

    // Class Variable
    static final int MAX = 100;
    public static void main(String[] args) {
        System.out.println(FinalVariable.MAX);
    }
}
