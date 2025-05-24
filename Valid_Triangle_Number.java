import java.util.Arrays;

public class Valid_Triangle_Number {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array
        int count = 0;
        int n = nums.length;

        // Step 2: Fix the third side (largest), iterate from end
        for (int i = n - 1; i >= 2; i--) {
            int left = 0;
            int right = i - 1;

            // Step 3: Use two pointers to find valid pairs
            while (left < right) {
                if (nums[left] + nums[right] > nums[i]) {
                    count += (right - left); // All elements between left and right are valid
                    right--;
                } else {
                    left++;
                }
            }
        }

        return count;
    }
}
