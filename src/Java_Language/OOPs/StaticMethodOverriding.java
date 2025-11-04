package Java_Language.OOPs;
class Parent_1{
    static void fun(){
        System.out.println("Parent's fun");
    }
}
class Child_1 extends Parent_1{
    static void fun(){
        System.out.println("Child's fun");
    }
}
class StaticMethodOverriding {
    public static void main(String[] args) {
        Parent_1 p = new Child_1();
        p.fun();
    }
}
