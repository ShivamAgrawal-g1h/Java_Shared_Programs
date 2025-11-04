package Java_Language.OOPs;
final class Test{
    void display(){
        System.out.println("Base Class");
    }
}
//class Derived extends Base{
// Compile time error : cannot extend final class
//}
class FinalClass{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.display();
    }
}
