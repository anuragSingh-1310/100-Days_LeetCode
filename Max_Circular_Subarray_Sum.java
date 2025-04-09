public class Max_Circular_Subarray_Sum {
    public int circularSubarraySum(int arr[]) {
        int n = arr.length;

        int maxKadane = kadane(arr);

        if(maxKadane < 0){
            return maxKadane;
        }

        int total = 0;
        for(int i = 0; i < n; i++){
            total += arr[i];
            arr[i] = -arr[i];
        }

        int minKadane = -kadane(arr);

        int maxCircular = total - minKadane;

        return Math.max(maxKadane, maxCircular);
    }
    public int kadane(int arr[]){
        int max = arr[0];
        int current = arr[0];

        for(int i = 1; i < arr.length; i++){
            current = Math.max(arr[i], current+arr[i]);
            max = Math.max(current, max);
        }

        return max;
    }

}
