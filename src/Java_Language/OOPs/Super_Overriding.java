package Java_Language.OOPs;
class Parent_2{
    void fun(){
        System.out.println("Parent Class fun");
    }
}
class Child_2 extends Parent_2{
    @Override
    void fun(){
        super.fun();
        System.out.println("Child Class fun");
        super.fun();
    }
}
class Super_Overriding {
    public static void main(String[] args) {
        Parent_2 p = new Child_2();
        p.fun();
    }
}
