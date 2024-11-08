package InterviewProblems;

import java.util.HashMap;
import java.util.Map;

public class stringCompression {
    public static void main(String[] args) {
        String st = "abbbbbbbbbbbbbbbbbbbbbbcde";
        HashMap<Character, Integer> mp = new HashMap<>();

        for(char k: st.toCharArray()){
            mp.put(k, mp.getOrDefault(k,0) + 1);
        }

        System.out.println(mp);

        String res ="";
        for(Map.Entry<Character, Integer> l : mp.entrySet()){
            int occ = l.getValue();

            while(occ>=10){
                String p ="";
                occ -= 9;
                p += Integer.toString(occ);


            }
            String p = Integer.toString(l.getValue());
//            System.out.println(p);
            res += p + l.getKey();

        }

        System.out.println(res);
    }
}
