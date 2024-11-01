package SlidingWindoAndTwoPointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class longestSubstringWithKMostDistinctCharacters {
    public static void main(String[] args) {
        String st = "aaabbcccccd";
        int l = 0, r = 0, k=2;
        int max_len = 0;
        HashMap<Character, Integer> res = new HashMap<>();
        while(r<st.length()){
            res.put(st.charAt(r), r);
            while(res.size()>k){
                l = res.get(st.charAt(l));
                res.remove(st.charAt(l));
                l++;
            }
            if(res.size()<=k){
                max_len = Math.max(max_len, r-l+1);
            }
            r++;
        }
        System.out.println(max_len);
    }


//    ================== BRUTE FORCE =============================
//    public static void main(String[] args) {
//        String st = "aaabbcd";
//        int k = 2;
//
//        int max_len = 0;
//
//        for(int i =0;i<st.length();i++){
//            HashMap<Character, Integer> mp = new HashMap<>();
//            for(int j = i;j<st.length();j++){
//                if(mp.size()<=k){
//                    mp.put(st.charAt(j), mp.getOrDefault(st.charAt(j), 0) + 1);
//                    max_len = Math.max(max_len, j-i);
//                }
//            }
//        }
//
//        System.out.println(max_len);
//    }
}
