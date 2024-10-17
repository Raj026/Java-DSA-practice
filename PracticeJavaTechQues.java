import java.util.ArrayList;
import java.util.Arrays;

public class PracticeJavaTechQues {
    public static void main(String[] args) {
//        ArrayList<ArrayList<Integer>> res = new ArrayList<>(
//                Arrays.asList(
//                        new ArrayList<>(Arrays.asList(1,2,3,4)),
//                        new ArrayList<>(Arrays.asList(5,6,7,8)),
//                        new ArrayList<>(Arrays.asList(9,10,11,12))
//                )
//        );
        ArrayList<Integer> s = new ArrayList<>(Arrays.asList(5,10,2,1));

        ArrayList<Integer> a = performOps(s);
        for(int i = 0;i<a.size();i++){
            System.out.println(a.get(i) + " ");
//            for(int j = 0;j<a.get(i).size();j++){
//                System.out.print(a.get(i).get(j) + " ");
//            }
        }


//        System.out.println(res);
    }

    public static ArrayList<Integer> performOps(ArrayList<Integer> A) {
        ArrayList<Integer> B = new ArrayList<Integer>();
        for (int i = 0; i < 2 * A.size(); i++) B.add(0);
        for (int i = 0; i < A.size(); i++) {
            B.set(i, A.get(i));
            B.set(i + A.size(), A.get((A.size() - i) % A.size()));
        }
        return B;
    }

//    public static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A){




}
