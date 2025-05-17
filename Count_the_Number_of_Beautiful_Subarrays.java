import java.util.HashMap;

public class Count_the_Number_of_Beautiful_Subarrays {
    public long beautifulSubarrays(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixXOR = 0;
        long count = 0;

        map.put(0, 1);

        for (int num : nums) {
            prefixXOR ^= num;

            count += map.getOrDefault(prefixXOR, 0);

            map.put(prefixXOR, map.getOrDefault(prefixXOR, 0) + 1);
        }

        return count;
    }
}
