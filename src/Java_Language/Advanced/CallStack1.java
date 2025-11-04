package Java_Language.Advanced;
/*
class CallStack1 {
    public static void main(String[] args) {
        methodA();
        System.out.println("123");
    }
    public static void methodA(){
        System.out.println("Entering methodA()");
        int a = 5,b = 0;
        int c = a/b;
        System.out.println(c);
    }
}
*/
/*
class CallStack1 {
    public static void main(String[] args) {
        try{
            methodA();
            System.out.println("Exit main()");
        }catch(ArithmeticException ex){
            System.out.println("ArithmeticException caught....");
            ex.printStackTrace();
        }
    }
    public static void methodA(){ // no need to mention
        //throws ArithmeticException as it's an unchecked exception
        //The Java compiler does not enforce the "handle or
        //declare" rule for unchecked exceptions
        System.out.println("Entering methodA()");
        int a = 5,b = 0;
        int c = a/b;
        System.out.println(c);
    }
}
*/
class CallStack1 {
    public static void main(String[] args) {
        try{
            methodA();
            // below code won't be executed as an uncaught exception is propagated
            System.out.println("Exit main()");
        }catch(ArithmeticException ex){
            System.out.println("ArithmeticException caught....");
            ex.printStackTrace();
        }finally {
            System.out.println("finally block of main()");
        }
        //below code will be executed as the exception is caught
        System.out.println("After try_catch_finally");
    }
    public static void methodA() throws ArithmeticException{
        try {
            System.out.println("Entering methodA()");
            int a = 5, b = 0;
            int c = a / b;
            System.out.println(c);
        }finally{
            System.out.println("finally in methodA()");
        }
        // the below code won't be executed if the exception
        // is not caught in this methodA()
        System.out.println("Exit methodA()");
    }
}