package Java_Language.Advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

class SampleLambda {
    static void printCond(Collection<Integer> c,
                          Predicate<Integer> p){
        for(Integer x : c){
            if(p.test(x))
                System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>(Arrays.asList(10,5,20,7,30));
        // A Naive code before Java 8
        class MyPredicateEven implements Predicate<Integer>{
            public boolean test(Integer x){
                return (x%2==0);
            }
        }
        printCond(al,new MyPredicateEven()); // an object of myPredicateEven class
        // can be assigned to Predicate<Integer> p as
        // this class implements the Predicate<Integer> interface

        // using anonymous classes before Java 8
        Predicate<Integer> myPredEvn = new Predicate<Integer>(){
            @Override
            public boolean test(Integer x){
                return (x%2==0);
            }
        };
        printCond(al,myPredEvn);

        // lambda expression
        printCond(al,x -> x%2==0);
    }
}
/**
 @FunctionalInterface
 public interface Predicate<T> {
    //code
    boolean test(T t);
    //code
 }
 */