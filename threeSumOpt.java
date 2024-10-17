import java.util.Arrays;
import java.util.*;

public class threeSumOpt {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,2,2,2,-2,-2,0};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<List<Integer>> ans = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j = i+1;
            int k = arr.length - 1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum<0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    List<Integer> res = Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(res);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;

                }
            }
        }
        System.out.println(ans);
    }
}
