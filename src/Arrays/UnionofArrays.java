package Arrays;

import java.util.Arrays;

public class UnionofArrays {
    static int[] unionArray(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // Traverse both arrays
        while (i < nums1.length && j < nums2.length) {

            int value;

            if (nums1[i] == nums2[j]) {
                value = nums1[i];
                i++;
                j++;
            }
            else if (nums1[i] > nums2[j]) {
                value = nums2[j];
                j++;
            }
            else {
                value = nums1[i];
                i++;
            }

            // Add only if it is not a duplicate
            if (k == 0 || result[k - 1] != value) {
                result[k] = value;
                k++;
            }
        }

        // Remaining elements of nums1
        while (i < nums1.length) {

            if (k == 0 || result[k - 1] != nums1[i]) {
                result[k] = nums1[i];
                k++;
            }

            i++;
        }

        // Remaining elements of nums2
        while (j < nums2.length) {

            if (k == 0 || result[k - 1] != nums2[j]) {
                result[k] = nums2[j];
                k++;
            }

            j++;
        }

        // Return array of exact required size
        return Arrays.copyOf(result, k);
    }


    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 7};

        int[] result = unionArray(nums1, nums2);

        System.out.println("Union of the two arrays:");
        System.out.println(Arrays.toString(result));
    }
}