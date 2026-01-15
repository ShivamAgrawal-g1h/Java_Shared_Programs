package Java_Language.Complexity;
class AvgCase {
    public static void main(String[] args) {
        int n = 7;
        // n = 1 to 50(inclusive)
        if(n>0 && n<11){
            System.out.println("1");
            System.out.println("2");
        } else if(n<16){
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
        } else{
            System.out.println("1");
        }
        // avg. time taken = ( 1 + 40/50(1) + 10/50(2)  + 5/50(3) + 35/50(1)  ) = some constant say 'c'
        // order of growth = c
        // time complexity = theta(c) = O(c) = Omega(c)
    }
}
