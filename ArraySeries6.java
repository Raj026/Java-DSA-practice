public class ArraySeries6 {
    public static void main(String[] args) {
        // Find Pivot Index Leetcode 724
        int[] nums = {1,7,3,6,5,6};
        int sum = 0;
        for(int i: nums) {
            sum += i;
        }
        int leftSum = nums[0], rightSum = 0;
        for(int i=1;i<nums.length;i++) {
            rightSum = sum - leftSum - nums[i];

            if(leftSum == rightSum) {
                System.out.println("Pivot Index = " + nums[i]);
                break;
            }
            else {
                leftSum += nums[i];
            }
        }

    }
}
