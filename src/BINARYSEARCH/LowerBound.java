package BINARYSEARCH;

public class LowerBound {

    public static int lowerBound(int[] nums, int x) {
        int n = nums.length;
        int low = 0;
        int right = n - 1;
        int ans = n;

        while (low <= right) {
            int mid = low + (right - low) / 2;

            if (nums[mid] >= x) {
                ans = mid;
                right = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 2, 4, 6};
        int x = 2;

        System.out.println(lowerBound(nums, x));
    }
}