import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class fourSumOpt {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,3,4,4,4,5,5};
        int target = 8;
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            for(int j= i+1;j<n;j++){
                if(j!=i+1 && arr[j]==arr[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if(sum>target){
                        l--;
                    } else if (sum < target) {
                        k++;
                    }
                    else {
                        List<Integer> ans = Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
                        res.add(ans);
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1])k++;
                        while(k<l && arr[l]==arr[l+1])l--;
                    }
                }
            }
        }

        System.out.println(res);
    }
}
