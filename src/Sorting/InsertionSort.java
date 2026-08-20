package Sorting;

public class InsertionSort {
    static void insertionsorting(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = i;
            int previous = i - 1;
            int currentValue = arr[current];

            while (previous >= 0 && currentValue < arr[previous]) {
                arr[previous + 1] = arr[previous];
                previous--;
            }
            //now we hv empty place
            // place the current calue
            arr[previous + 1] = currentValue;

        }
    }

    public static void main(String[] args) {
        int[] arr = {1 , 7 , 4 , 6, 5 , 0};
        insertionsorting(arr);
        for(int k: arr){
            System.out.println(k);
        }
    }
}
