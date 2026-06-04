package DSA_basics.Hashing;

import java.util.HashMap;

class Q4_Most_Frequent_Character {
     void main() {
        char ch = getMaxOccuringChar("Hello");
         System.out.println(ch);
    }
    public char getMaxOccuringChar(String s) {
        // code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)) map.put(ch,map.get(ch)+1);
            else map.put(ch,1);
        }
        char max = 'a' ;
        int max_count = 0;
        for(Character key : map.keySet()){
            if(map.get(key)>max_count){
                max_count = map.get(key);
                max = key;
            }
        }
        for(Character key : map.keySet()){
            if(max_count == map.get(key) && key<max) max = key;
        }
        return max;
    }
}
