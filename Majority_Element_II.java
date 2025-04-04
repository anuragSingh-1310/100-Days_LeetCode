import java.util.*;

public class Majority_Element_II {
    public List<Integer> majorityElement(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for (int num : arr) {
            if (!uniqueElements.contains(num)) {
                boolean m = reqElement(arr, num);
                if(m == true) {
                    res.add(num);
                    uniqueElements.add(num);
                }
            }
        }

        return res;
    }

    public static boolean reqElement(int[] arr, int n){
        int count = 0;
        for (int num : arr){
            if (n == num){
                count ++;
            }
        }

        if (count > arr.length/3){
            return true;
        }else{
            return false;
        }
    }
}
