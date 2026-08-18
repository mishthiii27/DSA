public class Array_02 {

    //Ques Sort array of 0s and 1s , such that 0s comes first and then the 1's
//}
//    static void sortArray(int[] arr){
//       int i = 0;
//       int j = arr.length-1;
//
//       while(i<j){
//           if(arr[i] == 1&& arr[j] == 0){
//               int temp = arr[i];
//               arr[i] = arr[j];
//               arr[j] = temp;
//            }
//
//           if(arr[i] == 0){
//               //i ko simply aage le jaao
//               i++;
//           }
//
//          if(arr[j] ==1 ){
//               //j ko peeche laana
//               j--;
//           }
//
//       }
//    }
//    public static void main(String[] args) {
//        int[] arr = { 0,0,1,1,0,1};
//                sortArray(arr);
//                for(int k: arr){
//                    System.out.println(k);
//                }
//    }
//}


//Ques 2 Missing Number in an array from a particular 0 to n range

static int missingNumber(int[] arr) {
    int ans = 0;

    for (int i = 0; i < arr.length; i++) {
        ans = ans ^ i;
        ans = ans ^ arr[i];
    }

    ans = ans ^ arr.length;

    return ans;
}

public static void main(String[] args) {

    int[] arr = {0, 1 , 2 ,3,  5};
    System.out.println(missingNumber(arr));
}
}
