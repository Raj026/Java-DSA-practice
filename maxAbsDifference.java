import java.util.ArrayList;
import java.util.Arrays;

public class maxAbsDifference {
    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(1,3,-1));

        for(int i=0;i<res.size();i++) {
            for(int j=0;j<res.size();j++) {
                int a = absDiff(i,j,res);
                System.out.println(a);
            }
        }

    }

    public static int absDiff(int a, int b, ArrayList<Integer> A) {
        int elem_diff = Math.abs(A.get(a)- A.get(b));
        int index_diff = Math.abs(a-b);

        return Math.abs(elem_diff + index_diff);
    }
}
