package Methods;
public class BasicMethod_fun {
    // main method that executes first when we run our program on console
    public static void main(String[] args) { // driver method - main method
        System.out.println("Main Begins"); // 1
        fun1(); // caling a function named fun1 // 6
        System.out.println("Main Ends"); // 7
    }
    public static void fun1(){
        System.out.println("fun1() Begins"); //2
        fun2(); // calling fun2() // 4
        System.out.println("fun1() Ends"); // 5
    }
    public static void fun2(){
        System.out.println("Inside fun2()"); //3
    }
}
// stack of fn. calls --> one fn. calling fn.2 and that fn.2 calling other and so on
//                        these can be considered as a stack of fn. calls
// stack --> one end open box in which only the recently added item can be removed
// once a fn. goes out of the stack it gives the control back to the caller