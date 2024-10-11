package Shubham;

public class TargetArray {
        static int binarySearch(int arr[], int L, int R,
                                int target)
        {
            while (L <= R) {
                int mid = L + (R - L) / 2;

                if (arr[mid] == target) {
                    return mid;
                }

                if (arr[mid] < target) {
                    L = mid + 1;
                }
                else {
                    R = mid - 1;
                }
            }

            return -1;
        }
        public static void main(String[] args)
        {
            int arr[] = {1,2,3,4,5};
            int n = arr.length;
            int target = 9;

            int index = binarySearch(arr, 0, n - 1, target);

            if (index != -1) {
                System.out.println("Target found at index "
                        + index);
            }
            else {
                System.out.println(
                        "Target not found in the array.");
            }
        }
    }
