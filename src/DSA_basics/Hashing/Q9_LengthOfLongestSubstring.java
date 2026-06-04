package DSA_basics.Hashing;
import java.util.HashMap;
import java.util.HashSet;

class Q9_LengthOfLongestSubstring {
    int longestUniqueSubstrin(String s) {
        // code here
        HashSet<Character> set = new HashSet<>();
        int i=0, j=0, n=s.length();
        int maxLen = 0;
        while(j<n){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
            }
            else{
                int len = j-i;
                if(maxLen<len) maxLen = len;
                while(s.charAt(i)!=s.charAt(j)){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
            }
            j++;
        }
        int len = j-i;
        if(maxLen<len) maxLen = len;
        return maxLen;
    }

    int longestUniqueSubstring(String s) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        int i = 0;
        int mlen = 0;
        for(int j=0; j<s.length(); j++){
            char ch = s.charAt(j);
            if(!map.containsKey(ch)){
                map.put(ch,j);
                int len = j-i+1;
                if(mlen<len) mlen = len;
            }
            else{
                i = Math.max(i, map.get(ch) + 1);
                int len = j-i+1;
                if(mlen<len) mlen = len;
                map.put(ch,j);
            }
        }
        return mlen;
    }
}
