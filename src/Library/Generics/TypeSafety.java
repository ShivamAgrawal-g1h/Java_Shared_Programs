package Library.Generics;
class Pair{
    Object x;
    Object y;
}
class Pair2<T,S>{
    T x;
    S y;
}
class Test{
    static void main(){
//        Pair p = new Pair();
//        p.x = 12;
//        p.y = "GFG";
//        String str = (String)p.x; // ClassCastException

        Pair2<Integer,String> p2 = new Pair2<>();
        p2.x = 12;
        p2.y = "GFG";
        // incompatible types: java.lang.Integer cannot be converted to java.lang.String
        // String str = (String)p2.x;
    }
}
