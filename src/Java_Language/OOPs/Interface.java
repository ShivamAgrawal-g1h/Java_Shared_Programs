package Java_Language.OOPs;
interface Printable{
    void print();
}
interface Comparable{
    void compare();
}
class Myclass implements Printable,Comparable{
    public void print(){
        System.out.println("Myclass");
    }
    public void compare(){
        System.out.println("Compare");
    }
}
class Interface {
    public static void main(String[] args) {
        Myclass m = new Myclass();
        m.print();
    }
}
