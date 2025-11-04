package Java_Language.OOPs;
class Base_1 {
    int x;
    Base_1(){x = 1;}
    Base_1(int i){x = i;}
}
class Derived_1 extends Base_1 {
    int y;
    Derived_1() {
        super();  // Calls Base class constructor with no parameters
        y = 2;
    }
    Derived_1(int i, int j) {
        super(i);  // Calls Base class constructor with one parameter
        y = j;
    }
    Derived_1(int j){
        super();
        y=j;
    }
}
class Super_Example {
    public static void main(String[] args) {
        Derived_1 d1 = new Derived_1(20);

        System.out.println(d1);
        System.out.println(d1.hashCode());

        System.out.println(d1.x);
        System.out.println(d1.y);
    }
}
