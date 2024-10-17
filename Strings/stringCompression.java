package Strings;

import java.util.HashMap;
import java.util.Map;

public class stringCompression {
    public static void main(String[] args) {
        char[] ch = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        int n = ch.length;
        Map<Character, Integer> mp = new HashMap<>();
        for(char c: ch){
            if(mp.containsKey(c)) {
                mp.put(c, mp.get(c) + 1);
            }
            else{
                mp.put(c, 1);
            }
        }
        String res = "";
        for(Map.Entry<Character, Integer> m:mp.entrySet()) {
            res += m.getKey();
            res += m.getValue();
        }

        System.out.println(res.length());
    }
}
