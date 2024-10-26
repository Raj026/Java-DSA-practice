package InterviewProblems;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr= {-1, 0, 1, 2, -1, -4};
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<n;i++){
            //this basically checks if the elements being inserted are repeated or not.
            // removing this if condition will result in giving two (-1,0,1)
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j = i+1;
            int k = n-1;

            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum<0){
                    j++;
                } else if (sum>0) {
                    k--;
                }
                else {
                    List<Integer> a = Arrays.asList(arr[i], arr[j], arr[k]);
                    res.add(a);
                    j++;
                    k--;
                    //To avoid duplicates
                    while(j<k && arr[j] == arr[j-1]) j++;
                    while(j<k && arr[k] == arr[k+1]) k--;
                }
            }
        }

        System.out.println(res);

    }




//================== BETTER APPROACH=================
//    public static void main(String[] args) {
//        int[] arr = {-1, 0, 1, 2, -1, -4};
//
//
        //Better Approach
//        Set<List<Integer>> ans = new HashSet<>();
//
//        for(int i = 0;i<arr.length;i++){
//            Set<Integer> st = new HashSet<>();
//            for(int j = i+1;j<arr.length;j++){
//                int sum = - (arr[i] + arr[j]);
//                if(st.contains(sum)){
//                    List<Integer> res = Arrays.asList(arr[i], arr[j], sum);
//                    res.sort(null);
//                    ans.add(res);
//                }
//                else {
//                    st.add(arr[j]);
//                }
//            }
//        }
//
//        List<List<Integer>> a = new ArrayList<>(ans);
//        System.out.println(a);
//    }
}
