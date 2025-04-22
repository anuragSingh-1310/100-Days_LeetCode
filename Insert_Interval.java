import java.util.ArrayList;

public class Insert_Interval {

    class Solution {
        static ArrayList<int[]> insertInterval(int[][] intervals, int[] newInterval) {
            ArrayList<int[]> result = new ArrayList<>();
            int i = 0;
            int n = intervals.length;

            // Add all intervals before newInterval
            while (i < n && intervals[i][1] < newInterval[0]) {
                result.add(intervals[i]);
                i++;
            }

            // Merge all overlapping intervals
            while (i < n && intervals[i][0] <= newInterval[1]) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                i++;
            }
            result.add(newInterval); // Add the merged interval

            // Add remaining intervals
            while (i < n) {
                result.add(intervals[i]);
                i++;
            }

            return result;
        }
    }

}
