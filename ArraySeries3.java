import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraySeries3 {
    public static void main(String[] args) {
        //Next Permutation
        List<Integer> a = Arrays.asList(new Integer[]{2, 1, 5, 4, 3, 0,0});
        List<Integer> res = nextPerm(a);
        for(int i=0;i<res.size();i++) {
            System.out.print(res.get(i) + " ");
        }
    }

    public static List<Integer> nextPerm(List<Integer> a) {
        int n = a.size();

        //We need to find the breakpoint (i.e- 1 2 3) Here breakpoint is 2 | 3
        int index = -1;
        for(int i=n-2; i>=0 ;i--) {
            if(a.get(i) < a.get(i+1)) {
                index = i;
                break;
            }
        }

        if(index==-1) {
            Collections.reverse(a);
            return a;
        }

        //next step is to find just slight greater element than the index element
        // and swap it with indexed element
        for(int i=n-1;i>index;i--) {
            if(a.get(i) > a.get(index)) {
                int temp = a.get(i);
                a.set(i, a.get(index));
                a.set(index, temp);
                break;
            }
        }

        List<Integer> sub = a.subList(index+1, n);
        Collections.reverse(sub);
        return a;
    }
}
