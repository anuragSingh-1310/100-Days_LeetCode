import java.util.ArrayList;
import java.util.List;

public class Add_to_Array_Form_of_Integer {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;
        int carry = 0;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            result.add(0, k % 10);
            k /= 10;
        }

        return result;
    }
}
