package DSA_basics.Recursion;
class Q19_Permutations_method_3 {
    static void main() {
        per("BAC");
    }
    static void per(String str) {
        char[] ch = str.toCharArray();
        p(ch,"");
    }
    static void p(char[] ch,String curr){
        int n = curr.length();
        if (curr.length() == ch.length) {
            System.out.print(curr+ " ");
            return;
        }
        for (int i = n; i < ch.length; i++) {
            swap(ch, n, i);        // FIX one character/ swap one character
            p(ch, curr+ch[n]); // PERMUTE rest/ swap rest
            swap(ch, n, i);        // BACKTRACK
        }
    }
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
