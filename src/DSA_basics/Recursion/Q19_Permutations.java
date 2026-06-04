package DSA_basics.Recursion;
/*
Given a string, print all permutations of it.

Given a string s, which may contain duplicate characters, your task is to
generate and return an array of all unique permutations of the string.
You can return your answer in any order.
Examples:
Input: s = "ABC"
Output: ["ABC", "ACB", "BAC", "BCA", "CAB", "CBA"]
Explanation: Given string ABC has 6 unique permutations.
 */
class Q19_Permutations {
    static void main() {
        per("ABA","");
    }
    static void per(String str,String curr){
        //str → remaining characters
        //curr → permutation built so far
        if(str.length()==0){
            System.out.print(curr + " ");
            return;
        }
        // Method-1 GAP/Insertion method
//         char ch = str.charAt(0);          // pick first character
//        String rest = str.substring(1);   // remaining string
//
//        // insert ch into all gaps of curr
//        for (int i = 0; i <= curr.length(); i++) {
//            String left = curr.substring(0, i);
//            String right = curr.substring(i);
//            per(rest, left + ch + right);
//        }

        // Method - 2 Fix one and permutate for rest
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Rest of the string after excluding
            // the ith character
            String remaining =
                    str.substring(0, i) + str.substring(i + 1);
            per(remaining, curr + ch);
        }
    }
}
