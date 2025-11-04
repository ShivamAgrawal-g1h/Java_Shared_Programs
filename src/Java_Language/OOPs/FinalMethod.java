package Java_Language.OOPs;
class Base {
    final void fun() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    // void fun() {
    //     System.out.println("Derived");
    // }
    // Uncommenting this will cause a compile-time error
}
class FinalMethod {
    public static void main(String[] args) {
        Base b1 = new Base();
        b1.fun();
        Derived d1 = new Derived();
        d1.fun();
    }
}
