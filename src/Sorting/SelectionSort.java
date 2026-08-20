package Sorting;

public class SelectionSort {
    static void selectionSorting(int[] arr){
        for(int i=0; i< arr.length-1; i++){  //outer loop for rounds
            int minIndex = i;
            for(int j = i+1; j< arr.length-1; j++){  //inner loop
                if(arr[j] < arr[minIndex]) {
                    minIndex = arr[j];
                }
                }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

    }
    public static void main(String[] args) {
        int[] arr = { 1, 6,4,5,3};
       selectionSorting(arr);
       for(int result: arr)
        System.out.println(result);
    }
}
