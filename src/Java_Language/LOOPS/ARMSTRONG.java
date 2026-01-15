package Java_Language.LOOPS;
import java.util.Scanner;
class ARMSTRONG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            //check is 'i' an armstrong number
            //Step1 : count number of digits
            int num = i;
            int count =0;
            while(num!=0){
                num = num/10;
                count++;
            }
            //Step2: get sum of (digit^(no. of digits))
            int sum =0;
            num = i;
            while(num!=0){
                int add = 1;
                for(int k=0; k<count; k++){
                    add = add*(num%10);
                }
                num = num/10;
                sum = sum + add;
            }
            //Step3 : check sum ==i
            if(sum ==i) System.out.println("Armstrong number : "+i);
        }
    }
}
