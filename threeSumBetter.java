import java.util.*;

public class threeSumBetter {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};

        boolean flag = false;
        Set<List<Integer>> ans = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            HashSet<Integer> res = new HashSet<>();
            for(int j=i+1;j< arr.length;j++){
                int sum = - (arr[i] + arr[j]);
                if(res.contains(sum)){
                    List<Integer> tmp = Arrays.asList(arr[i],arr[j],sum);
                    tmp.sort(null);
                    ans.add(tmp);
                }
                else{
                    res.add(arr[j]);
                }

            }
        }
        System.out.println(ans);
    }
}
