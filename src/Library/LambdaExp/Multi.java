package Library.LambdaExp;
interface Test3{
    void print(Integer p1, Integer p2);
}
class Multi {
    static void fun(Test3 t, Integer p1, Integer p2){
        t.print(p1,p2);
    }

    static void main() {
        fun( (p1,p2) -> System.out.println(p1+" "+p2),10,20);
    }
}
