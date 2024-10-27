package SlidingWindoAndTwoPointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeatingCharacters {

//    ============= BETTER APPROACH ================
    public static void main(String[] args) {
        String st = "abcabcdbb";

        int l = 0,max_len = Integer.MIN_VALUE;
        Set<Character> s = new HashSet<>();
        for(int i = 0;i<st.length();i++){
            if(s.contains(st.charAt(i))){
                while(l<i && s.contains(st.charAt(i))){
                    s.remove(st.charAt(l));
                    l++;
                }

            }
            s.add(st.charAt(i));
            max_len = Math.max(max_len, i-l+1);
        }

        System.out.println(max_len);
    }

//    =========OPTIMAL APPROACH==============
//    public static void main(String[] args) {
//        String st = "abcabcdbb";
//        char[] c = st.toCharArray();
//
//        HashMap<Character, Integer> mp = new HashMap<>();
//
//        int l=0,r=0, n=c.length;
//        int max_len = Integer.MIN_VALUE;
//        while (r<n){
//            if(mp.containsKey(c[r])){
//                l = Math.max(l, mp.get(c[r]) + 1);
//            }
//            mp.put(c[r], r);
//            max_len = Math.max(max_len, r-l+1);
//            r++;
//        }
//        System.out.println(max_len);
//    }
}
