package Java_Language.Basics;
//Example
class NonPrimitiveTypes3 {
    static int x = 11;
    private int y = 33;
    public void method1(int x){
        NonPrimitiveTypes3 t = new NonPrimitiveTypes3();
        this.x = 22;
        y = 44;
        System.out.println(this.x);
        System.out.println(t.x);
        System.out.println(t.y);
        System.out.println(y);
        System.out.println(x);
    }
    public static void main(String[] args) {
        NonPrimitiveTypes3 t = new NonPrimitiveTypes3();
        t.method1(5);
    }

}
