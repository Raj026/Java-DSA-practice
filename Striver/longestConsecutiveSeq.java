package Striver;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutiveSeq {
    public static void main(String[] args) {
        int[] arr = {1,101,100,102,2,103,3,4,105};
        int n = arr.length;

        Set<Integer> hashSet = new HashSet<>();
        for(int i:arr){
            hashSet.add(i);
        }

        int k  = hashSet.size();
        int longest = 1;

        for(int it:hashSet){

            if(!hashSet.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(hashSet.contains(x+1)) {
                    cnt++;
                    x++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        System.out.println(longest);

        for(int l:hashSet){
            System.out.println(l);
        }
    }
}
