package Recursion;

public class Recursion2 {


    // Ques Find index of a element by searching it in Array using Recursion
    static int findTarget(int[] arr, int i, int target) {
        //base case
        if (i >= arr.length) {
            return -1;  //not found
        }
        // processing
        if (arr[i] == target) {
            return i;
        }
        //Rc
       return findTarget(arr, i + 1, target);
    }

    public static void main(String[] args) {

        int[] arr = {10, 23, 34, 50, 43,};
        int i = 0;
        int target = 33;
       int result = findTarget(arr, i, target);
        System.out.println(result);
    }
}
