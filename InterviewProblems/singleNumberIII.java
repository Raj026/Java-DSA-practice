package InterviewProblems;

import java.util.*;

public class singleNumberIII {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,1,2,3,5));

        Collections.sort(a);

        int[] res = new int[2];
        int indx = 0;

        Set<Integer> st = new HashSet<>();

        for(int i: a){
            if(st.contains(i)){
                res[indx++] = i;
            }

            st.add(i);
        }

        System.out.println(Arrays.toString(res));
    }
}
