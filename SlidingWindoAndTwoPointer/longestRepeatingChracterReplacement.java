package SlidingWindoAndTwoPointer;

import java.util.Arrays;

public class longestRepeatingChracterReplacement {
    public static void main(String[] args) {
        String st = "AABAABCEEEAEEA";
        int[] hash = new int[26];
        int k = 2;
        int l = 0,r = 0, max_len = 0, max_freq = 0;
        char[] c = st.toCharArray();
        while(r < c.length){
            hash[c[r] - 'A']++;
            max_freq = Math.max(max_freq, hash[c[r] - 'A']);
            if((r-l+1) - max_freq > k){
                hash[c[l] - 'A']--;
                max_freq = 0;
                l++;
            }
            if((r-l+1) - max_freq <= k){
                max_len = Math.max(max_len, r-l+1);
            }
            r++;
        }

//        System.out.println(Arrays.toString(hash));
        System.out.println(max_len);
    }
}
