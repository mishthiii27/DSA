class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: find the pivot (first index from right where nums[i] < nums[i+1])
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: if pivot exists, find the just-larger element and swap
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: reverse the suffix (whole array if no pivot)
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}