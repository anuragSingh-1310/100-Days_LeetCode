import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {
    class Solution {
        public int romanToInt(String s) {
            Map<Character, Integer> map = new HashMap<>();
            map.put('I', 1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);

            int result = 0;
            for (int i = 0; i < s.length(); i++) {
                int currentVal = map.get(s.charAt(i));
                if (i + 1 < s.length() && currentVal < map.get(s.charAt(i + 1))) {
                    result -= currentVal; // Subtract if smaller than next
                } else {
                    result += currentVal; // Otherwise, add
                }
            }
            return result;
        }
    }

}
