package Library.LambdaExp;
interface Test1{
    void print();
}
class No {
    static void fun(Test1 t){
        t.print();
    }

    static void main() {
        fun(() -> System.out.println("Hello"));
    }
}
