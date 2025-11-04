package Java_Language.OOPs.AccessModifiers;
class A{
    private int x=33;
    int y = 89;
    int getX(){
        return x;
    }
}
class private_modifier {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.getX());
        //System.out.println(obj.x); - will give compiler error
        System.out.println(obj.y);
    }
}
