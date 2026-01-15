package Java_Language.LOOPS;

class ForLoop {
    public static void main(String[] args) {
        int i;
        for(i=0; i<5; i++){
            System.out.println("H");
        }

        int sum=0;
        int[] arr = {7,3,9,12};
        System.out.println(i);
        for(int n : arr){
            sum += n;
        }
        System.out.println(sum);
    }
}
