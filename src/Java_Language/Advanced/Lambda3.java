package Java_Language.Advanced;
//import java.util.function.Supplier;
@FunctionalInterface
interface Func {
    int operation(int a, int b);
    //takes 2 arguments, do an operation & returns int value
}
class Lambda3 {
    public static void main(String[] args) {
        Func f = (a,b) -> {
            // some sample code
            a = a*b;
            b = a - b;
            return a+b;
        };
        int val = f.operation(2,5);
        System.out.println(val);

        // another example
        // Supplier a = () -> "a";
        //System.out.println(a.get());
    }

}
