import java.util.*;

public class ArraySeries5 {
    public static void main(String[] args) {
        //Group Anagrams - Leetcode 49
        String[] st = {"bat", "tan", "nat", "eat", "ate", "tea"};
        Map<String, List<String>> mp = new HashMap<>();
        for(String s:st) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
//            System.out.println(c);
            String sorted = new String(c);
            if(!mp.containsKey(sorted)) {
                mp.put(sorted, new ArrayList<>());
            }

            mp.get(sorted).add(s);
        }
//        System.out.println(mp.keySet());
        System.out.println(new ArrayList<>(mp.values()));
    }
}
