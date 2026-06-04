package DSA_basics.Hashing;

import java.util.HashMap;

class Q6_Anagram {
//    public static boolean areAnagrams(String s1, String s2) {
//        // code here
//        int n1 = s1.length(), n2 = s2.length();
//        if(n1!=n2) return false;
//        int[] freq = new int[26];
//        for(int i=0; i<n1; i++){
//            freq[s1.charAt(i)-97] +=1;
//            freq[s2.charAt(i)-97] -=1;
//        }
//        for(int i=0; i<26; i++){
//            if(freq[i]!=0) return false;
//        }
//        return true;
//    }

    boolean areAnagrams(String s1, String s2) {
        // code here
        int n1 = s1.length(), n2 = s2.length();
        if(n1!=n2) return false;

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0 ;i<n1; i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(map.containsKey(ch1))
                map.put(ch1,map.get(ch1)+1);
            else map.put(ch1,1);
            if(map.containsKey(ch2))
                map.put(ch2,map.get(ch2)-1);
            else map.put(ch2,-1);

        }
        for(int i=0; i<n1; i++){
            char ch = s1.charAt(i);
            if(map.get(ch)!=0) return false;
        }
        return true;
    }
}
