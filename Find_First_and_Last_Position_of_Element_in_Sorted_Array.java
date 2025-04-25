public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {
    public int[] searchRange(int[] nums, int target) {
        int first = findIndex(nums, target, true);
        int last = findIndex(nums, target, false);
        return new int[]{first, last};
    }

    private int findIndex(int[] nums, int target, boolean isFirst) {
        int low = 0, high = nums.length - 1, index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (isFirst) high = mid - 1;
                else low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return index;
    }
}
