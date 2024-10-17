package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class longestSubstringwithoutRepeatingCharacters {
    public static void main(String[] args) {
        char[] c = {'a', 'b', 'c', 'a','a','b','c','d','e','b' ,'a'};
        int n  = c.length;
        int max_len = Integer.MIN_VALUE;
        int l = 0, r = 0;

        HashMap<Character, Integer> mp = new HashMap<>();
        while(r<n){
            if(mp.containsKey(c[r])){
                l = Math.max(mp.get(c[r]) + 1, l);
//                mp.put(c[r], r);
            }
            mp.put(c[r], r);
            max_len = Math.max(max_len, r-l+1);

            r++;
        }
        System.out.println(max_len);
//        for(int i = 0;i<n;i++) {
//
//        }
        System.out.println(mp);
//        HashSet<Character> res = new HashSet<>();
//        int l = 0;
//        for(int i = 0;i<n;i++) {
//            if(res.contains(c[i])){
//                while(res.contains(c[i])) {
//                    res.remove(c[i]);
//                    l++;
//                }
//                res.add(c[i]);
//            }
//            else{
//                res.add(c[i]);
//                max_len = Math.max(max_len, (i-l+1));
//            }
//        }
//
//        System.out.println(max_len);
    }
}
