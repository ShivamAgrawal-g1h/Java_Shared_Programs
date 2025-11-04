package Java_Language.ArrayList;
import java.util.ArrayList;
import java.util.List;
class Q6_Missing{
    public static int missingPositiveNumber(ArrayList<Integer> numbers) {
        int n = numbers.size();
        int ans = 0;
        for(int i=1; i<n+1; i++){
            boolean is_present = false;
            for(int j=0; j<n; j++){
                // if i is present in numbers continue else ans = i
                int ele = numbers.get(j);
                if(ele==i) is_present = true; // i is in the list
            }
            if(is_present) continue;
            else{
                ans = i;
                break;
            }
        }
        if(ans == 0) return n+1; // If 1...n all exist, return n+1
        else return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(List.of(1,2,3,4,5,6));
        int missNum = missingPositiveNumber(al);
        System.out.println(missNum);
    }
}
