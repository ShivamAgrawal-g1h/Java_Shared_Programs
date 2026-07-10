package Library.LambdaExp;
interface Test2{
    void print(Integer p);
}
class Single {
    static void fun(Test2 t, Integer p){
        t.print(p);
    }

    static void main() {
        fun( (p) -> System.out.println(p),10);
    }
}
