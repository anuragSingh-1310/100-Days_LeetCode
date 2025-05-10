import java.util.HashMap;

public class Max_Number_of_K_Sum_Pairs {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int operations = 0;

        for (int num : nums) {
            int complement = k - num;

            if (freq.getOrDefault(complement, 0) > 0) {
                operations++;
                freq.put(complement, freq.get(complement) - 1);
            } else {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
        }

        return operations;
    }
}
