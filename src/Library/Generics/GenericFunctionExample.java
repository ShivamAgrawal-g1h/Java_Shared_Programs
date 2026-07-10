package Library.Generics;

class GenericFunctionExample{
    public static <T> int count(T arr[], T x){
        int c = 0;
        for(T e : arr)
            if(e.equals(x))c++;
        return c;
    }

    static void main() {
        Integer[] arr = {10, 20, 30, 40, 10, 30};
        System.out.println(count(arr,10));
    }
}