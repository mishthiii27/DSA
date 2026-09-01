package ArraysQuestions;

public class Sort0s1s2s {
        public static void sort(int[] arr) {

            int low = 0;
            int mid = 0;
            int high = arr.length - 1;

            while (mid <= high) {

                if (arr[mid] == 0) {
                    // Put 0 at the beginning
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;

                    low++;
                    mid++;
                }

                else if (arr[mid] == 1) {
                    // 1 is already in the correct middle section
                    mid++;
                }

                else {
                    // Put 2 at the end
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;

                    high--;
                }
            }
        }

        public static void main(String[] args) {

            int[] arr = {2, 0, 1, 2, 1, 0, 2, 1};

            sort(arr);

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }


