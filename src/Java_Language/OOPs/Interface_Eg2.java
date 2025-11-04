package Java_Language.OOPs;
interface Fun{
    default void fun1(){
        System.out.println("fun1()");
    }
    static void fun2(){
        System.out.println("fun2()");
    }
    void fun3();
}
class Interface_Eg2 implements Fun{
    public void fun3(){
        System.out.println("fun3()");
    }
    public static void main(String[] args) {
     Interface_Eg2 t = new Interface_Eg2();
     t.fun1();
     t.fun3();
     Fun.fun2();
    }
}
