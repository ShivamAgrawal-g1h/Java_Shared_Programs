package Java_Language.Advanced;

import java.util.Arrays;
import java.util.List;

class MethodRef2 {
    public static void main(String[] args) {
        List<Integer> al = Arrays.asList(10,20,7,8);
        // Method reference to a static method
        al.forEach(MethodRef2::printSq);
        // MethodRef2::printSq is called for each element of the list
        al.forEach(x->printSq(x));
    }
    public static void printSq(Integer x){
        System.out.println(x*x);
    }
}
