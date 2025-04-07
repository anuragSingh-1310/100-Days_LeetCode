public class Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int currentmax = 0;

        for(int i = 0; i < nums.length; i++){
            currentmax = Math.max(nums[i], currentmax+nums[i]);
            max = Math.max(max, currentmax);
        }

        return max;
    }
}
