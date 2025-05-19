import java.util.*;

public class Count_Pairs_Whose_Sum_is_Less_than_Target {
    public int countPairs(List<Integer> nums, int target) {
        int[] arr = nums.stream().mapToInt(i -> i).toArray();
        Arrays.sort(arr);

        int left = 0, right = arr.length - 1, count = 0;

        while (left < right) {
            if (arr[left] + arr[right] < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}

