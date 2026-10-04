class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
       int low = 0;
       int right = n-1; 
       while(low <= right){
               int mid = low + (right - low) / 2;

        if(nums[mid] == target){
            return mid;
        }
        else if (nums[mid] < target){
            low = mid + 1;
        }
        else {
            right = mid - 1;
        }
       }
       return low;
    }
}