package Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumLC {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        int n = arr.length;

        int target = 7;
//        List<List<Integer>> l = new ArrayList<>();
        System.out.println(helper(arr, target));


    }

    public static List<List<Integer>> helper(int[] arr,int target){
        List<List<Integer>> k = new ArrayList<>();
        findCombinations(arr, 0, target, k, new ArrayList<>());
        return k;
    }

    public static void findCombinations(int[] arr, int index, int target, List<List<Integer>> ans, List<Integer> a){
        if(target==0){
            ans.add(new ArrayList<>(a));
            return;
        }

        if(index== arr.length || target<0){
            return;
        }

        //Include the current element and not to move forward , we can get the target by repetitive element only.
        if(arr[index]<=target){
            a.add(arr[index]);
            findCombinations(arr, index,target-arr[index],ans, a);
            // if target exceeds or can't be fulfilled , we backtrack and remove the element.
            a.remove(a.size()-1);
        }

        // Exclude the element and move the index forward.
        findCombinations(arr, index+1, target, ans, a);
    }
}
