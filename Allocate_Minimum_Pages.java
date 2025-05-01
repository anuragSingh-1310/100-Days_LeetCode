public class Allocate_Minimum_Pages {
    public static int findPages(int[] arr, int k) {
        int n = arr.length;
        if (k > n) return -1;

        int low = Integer.MIN_VALUE, high = 0;
        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }

        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private static boolean isPossible(int[] arr, int k, int maxPages) {
        int students = 1;
        int pagesSum = 0;

        for (int pages : arr) {
            if (pagesSum + pages > maxPages) {
                students++;
                pagesSum = pages;
                if (students > k) return false;
            } else {
                pagesSum += pages;
            }
        }

        return true;
    }
}
