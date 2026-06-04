package DSA_basics.Arrays;

import java.util.Arrays;

class Q6_MostFreqChar {
    // M-1 : Brute Force
//    char getMaxOccuringChar(String s) {
//        int n = s.length();
//        int maxFreq = 0;
//        char maxChar = s.charAt(0);
//        for(int i=0; i<n; i++)
//        {
//            int freq = 1;
//            char ch = s.charAt(i);
//            for(int j=i+1; j<n; j++)
//                if(ch == s.charAt(j)) freq++;
//            if(freq>maxFreq){
//                maxFreq = freq;
//                maxChar = ch;
//            }
//            else if(freq==maxFreq && ch<maxChar){
//                maxChar = ch;
//            }
//        }
//        return maxChar;
//    }

    // M-2 : Sliding Window
    char getMaxOccuringChar(String s) {
        int n = s.length();
        int maxFreq = 0;
        char maxChar = s.charAt(0);
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        int i=0, j=0;
        while(j<n){
            while(j<n && arr[i]==arr[j]) j++;
            int freq = j-i;
            if(freq > maxFreq){
                maxFreq = freq;
                maxChar = arr[i];
            }
            i = j;
        }
        return maxChar;
    }
}
