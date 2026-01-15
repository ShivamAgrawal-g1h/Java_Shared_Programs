package Java_Language.Operators;

class Sum_of_n_naturalNumbers {
    public static void main(String[] args) {
        int n = 5;
        //Method-1 :
//        int sum = 0;
//        for(int i=0; i<n; i++){
//            sum += i;
//        }
//        System.out.println(sum);
        //Method-2 :
//        int sum = n*(n+1)/2;
//        System.out.println(sum);
        //Method-3 :
        int sum = n*((n+1)/2);
        System.out.println(sum);
    }
}
