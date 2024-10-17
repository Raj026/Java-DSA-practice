package Strings;

import java.util.Arrays;

public class checkAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "gramana";


        if(s.length() != t.length()) {
            System.out.println("NO anagram");
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        boolean fl = true;

        for(int i=0;i<a.length;i++) {
            if(a[i] != b[i]) {
                fl = false;
            }
        }

        if(fl) {
            System.out.println("Anagrams");
        }
    }
}
