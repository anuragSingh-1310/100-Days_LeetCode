public class Count_Inversions {
    class Solution {
//     static int inversionCount(int arr[]) {
//         int n = arr.length;
//         int count = 0;

//         for (int i = 0; i < n - 1; i++) {
//             for (int j = i + 1; j < n; j++) {
//                 if (arr[i] > arr[j]) {
//                     count++;
//                 }
//             }
//         }

        //         return count;
//     }
// }
        static int inversionCount(int arr[]) {
            int n = arr.length;
            int[] temp = new int[n];
            return mergeSort(arr, temp, 0, n - 1);
        }

        static int mergeSort(int[] arr, int[] temp, int left, int right) {
            int inv_count = 0;
            if (left < right) {
                int mid = (left + right) / 2;
                inv_count += mergeSort(arr, temp, left, mid);
                inv_count += mergeSort(arr, temp, mid + 1, right);
                inv_count += merge(arr, temp, left, mid, right);
            }
            return inv_count;
        }

        static int merge(int[] arr, int[] temp, int left, int mid, int right) {
            int i = left;
            int j = mid + 1;
            int k = left;
            int inv_count = 0;

            while (i <= mid && j <= right) {
                if (arr[i] <= arr[j]) {
                    temp[k++] = arr[i++];
                } else {
                    temp[k++] = arr[j++];
                    inv_count += (mid - i + 1);
                }
            }

            while (i <= mid) {
                temp[k++] = arr[i++];
            }

            while (j <= right) {
                temp[k++] = arr[j++];
            }

            for (i = left; i <= right; i++) {
                arr[i] = temp[i];
            }

            return inv_count;
        }
    }
}
