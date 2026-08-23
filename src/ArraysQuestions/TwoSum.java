package ArraysQuestions;

public class TwoSum {
  public  static int[] twoSum(int[] nums, int target) {
      int n = nums.length;

      for (int i = 0; i < n - 1; i++) {
          for (int j = i + 1; j <= n - 1; j++) {
              if (nums[i] + nums[j] == target) {
                  int ans[] = {i, j};
                  return ans;
              }
          }
      }
      return new int[0];
  }

    public static void main(String[] args) { //for loop
        int[] nums = {2 , 5, 11, 15};
        int target = 7;
        int result[] = twoSum(nums, target);
        for(int x: result){
            System.out.println(x);
        }
    }
}
