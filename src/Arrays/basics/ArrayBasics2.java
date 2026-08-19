package Arrays.basics;

public class ArrayBasics2 {


    //Ques1  Search an element in array
//    static boolean findTarget(int[] arr, int target){
//
//        for(int i =0; i<=arr.length - 1; i++) {
//            if (arr[i] == target) {
//                return true;
//            }
//        }
//        //if entire array was traversed and target was not found
//        return false;
//    }



    // Ques2 sum of -ve and +ve number
//    static int[] sumofposneg(int[] arr){
//        int positive = 0;
//        int negative = 0;
//        for(int i = 0; i <= arr.length-1; i++){
//            if(arr[i] >= 0){
//                positive = positive + arr[i];
//            }
//            else{
//                negative = negative + arr[i];
//            }
//        }
//        int[] ans = {positive, negative};
//        return ans;
//
//    }

    // Ques3 Count num of zeros and ones
//    static int[] countZerosOnes(int[] arr){
//        int count1 =0;
//        int count0= 0;
//
//        for(int i =0; i<=arr.length -1; i++){
//            if(arr[i] == 1){
//                count1 = count1 + 1;
//            }
//            else if(arr[i] == 0){
//                count0 = count0 + 1;
//            }
//        }
//
//       int result[] = { count1, count0} ;
//        return result;
//    }


    //Ques4 Find first unsorted element in array
//    static int firstUnsortedElement(int[] arr){
//        int temp = 0;
//
//
//        for(int i =0; i<= arr.length-1; i++){
//            if(arr[i] > temp){
//                temp = arr[i];
//            }
//            else{
//                System.out.println(temp);
//            }
//        }
//        return temp;
//    }
//    public static void main(String[] args) {
//        int[] arr = { 10 , 20 , 30 , 33, 31};
//        int result = firstUnsortedElement(arr);
//        System.out.println(result);






//        int[] arr = { 1, 0 , 1, 0 , 1, 0, 2};
//        int[] result = countZerosOnes(arr);
//        System.out.println(result[0]);
//        System.out.println(result[1 ]);
//
//




//        int[] arr = {-1, 10 , 20 , -30 , 40};
//
//        int[] ans = sumofposneg(arr);
//        System.out.println(ans[0]);
//        System.out.println(ans[1]);
        //      int target = 9;
//
//        boolean result = findTarget(arr, target);
//        System.out.println(result);
    }




