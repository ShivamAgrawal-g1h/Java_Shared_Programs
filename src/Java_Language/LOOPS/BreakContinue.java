package Java_Language.LOOPS;
class BreakContinue {
    public static void main(String[] args) {
        //break
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                if(j==1)
                    break;
                System.out.println("j = "+j);
            }
            System.out.println("i = "+i);
        }

        //continue
        for(int i=0; i<5; i++){
            if(i==3)
                continue;
            System.out.println(i);
        }
    }
}
