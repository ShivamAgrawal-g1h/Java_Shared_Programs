package Library.Generics;

class MyGen<T>{
    T x;
    static int count;
    MyGen(){ count++; }
}
class GuessTheOutput_1 {
    static void main() {
        MyGen<Integer> m1 = new MyGen<>();
        MyGen<String> m2 = new MyGen<>();
        System.out.println(MyGen.count);
    }
}
