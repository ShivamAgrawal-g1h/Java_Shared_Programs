package Library.LambdaExp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

class UsingLambdaExp_Example3 {
    static void main() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10,5,20,7,30));
        printCond(list, x -> x%2 == 0);
    }
    static void printCond(Collection<Integer> c, Predicate<Integer> p){
        for(Integer x : c){
            if(p.test(x)) System.out.print(x+" ");
        }
    }
}
