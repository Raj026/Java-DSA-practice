import java.util.ArrayList;
import java.util.List;

public class pascalTriangleOpt {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> ans = pascalT(n);
        for(List<Integer> it: ans){
            for(int el: it){
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    public static List<List<Integer>> pascalT(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int row=1;row<=n;row++){
            List<Integer> tmpList = new ArrayList<>();
            for(int col=1;col<=row;col++){
                tmpList.add(nCr(row - 1, col-1));
            }
            ans.add(tmpList);
        }
        return ans;

    }

    public static int nCr(int n, int r){
        int res = 1;
        for(int i=0;i<r;i++){
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }
}
