import java.util.*;

public class Overlapping_Intervals {
    public List<int[]> mergeOverlap(int[][] arr) {
        List<int[]> result = new ArrayList<>();

        if (arr == null || arr.length == 0) {
            return result;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int[] current = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (current[1] >= arr[i][0]) {
                current[1] = Math.max(current[1], arr[i][1]);
            } else {
                result.add(current);
                current = arr[i];
            }
        }

        result.add(current);
        return result;
    }
}
