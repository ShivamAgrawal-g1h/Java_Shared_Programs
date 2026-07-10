package Library.Generics;

import java.util.ArrayList;

class BoundedWildcard {
    static void main() {
        ArrayList<? extends Student> al1 = new ArrayList<>();
        ArrayList<EnggStudent> al2 = new ArrayList<>();
        al1 = al2;


        ArrayList<? super Student> al3 = new ArrayList<>();
        ArrayList<Object> al4 = new ArrayList<>();
        al3 = al4;
    }
}
