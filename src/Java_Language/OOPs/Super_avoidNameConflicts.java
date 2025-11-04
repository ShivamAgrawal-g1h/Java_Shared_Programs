package Java_Language.OOPs;
class Base_2{
    int x = 10;
}
class Derived_2 extends Base_2{
    int x = 20;
    void print(){
        System.out.println("Parent class 'x' : "+super.x);
        System.out.println("Child class 'x' : "+x);
    }
}
class Super_avoidNameConflicts {
    public static void main(String[] args) {
        Derived_2 d = new Derived_2();
        d.print();
    }
}
