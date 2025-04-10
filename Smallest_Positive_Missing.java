import java.util.*;

public class Smallest_Positive_Missing {
    public int missingNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            if(i > 0) set.add(i);
        }

        int i = 1;
        while(true){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
    }
}
