public class Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int maxEnd = nums[0];
        int minEnd = nums[0];
        int maxProd = nums[0];

        for (int i = 1; i < nums.length; i++){
            int tempmax = maxEnd;
            int tempmin = minEnd;
            maxEnd = Math.max(nums[i], Math.max(tempmax*nums[i], tempmin*nums[i]));
            minEnd = Math.min(nums[i], Math.min(tempmax*nums[i], tempmin*nums[i]));

            maxProd = Math.max(maxEnd, maxProd);
        }

        return maxProd;
    }
}
