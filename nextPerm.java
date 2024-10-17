import java.util.Arrays;

public class nextPerm {
    public static void main(String[] args) {
        int[] nums = {1,2,3};

        int i = nums.length - 1;

        //find firrst decreasing element from right hand side.
        while(i>0 && nums[i-1] >= nums[i]) {
            i--;
        }
        int indx = i;
        System.out.println(nums[indx - 1]); //this will b 1 here

        if(i!=0) {
            for(int j=nums.length - 1;j>=indx;j--) {
                if(nums[j] > nums[indx-1]){
                    indx = j;
                    break;
                }
            }

            swap(nums, indx, i-1); //swap the slight greater number with first decreasing element
        }

        //reverse the whole section right from the just swapped element
        reverse(nums, i, nums.length-1);

        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] nums, int i, int i1) {
        while(i<i1){
            swap(nums, i, i1);
            i++;
            i1--;
        }
    }

    private static void swap(int[] nums, int indx, int i) {
        int temp = nums[indx];
        nums[indx] = nums[i];
        nums[i] = temp;
    }
}
