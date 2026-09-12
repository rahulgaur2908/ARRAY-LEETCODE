class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;

        int[] new_arr = new int[n];

        int i = 0, j = 0, k = 0;

        // Merge both sorted arrays
        while (i < n1 && j < n2) {

            if (nums1[i] < nums2[j]) {
                new_arr[k++] = nums1[i++];
            } else {
                new_arr[k++] = nums2[j++];
            }
        }

        // Copy remaining elements of nums1
        while (i < n1) {
            new_arr[k++] = nums1[i++];
        }

        // Copy remaining elements of nums2
        while (j < n2) {
            new_arr[k++] = nums2[j++];
        }

        // Find median
        if (n % 2 == 1) {
            return new_arr[n / 2];
        } else {
            return (new_arr[n / 2 - 1] + new_arr[n / 2]) / 2.0;
        }
    }
}


        