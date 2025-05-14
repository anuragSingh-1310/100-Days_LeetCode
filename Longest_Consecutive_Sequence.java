import java.util.HashSet;

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxLength = 0;

        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
}
