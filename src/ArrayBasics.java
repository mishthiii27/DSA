public class ArrayBasics {
    public static void main(String[] args) {


        //Ques 1   is to sum all the elements of the array
        int[] myarr = {10, 20, 30, 40};
        int n = myarr.length;
        int sum = 0;
        for (int index = 0; index <= n - 1; index++) {
            sum += myarr[index];
        }
        System.out.println(sum);

        //   Ques 2 multiplu each element of array
//        int[] myarr2 = {1, 2, 3, 4};
//        int n = myarr2.length;
//        int multiply = 1;
//        for (int index = 0; index <= n - 1; index++) {
//            multiply *= myarr2[index];
//        }
//        System.out.println(multiply);

// Ques 3 Finding max element in arr

//      int[] arr3 ={ 2 ,-4 ,5 ,1,15};
//      int n = arr3.length;
//      int temp = 0;
//      for(int index = 0; index<= n-1; index++){
//          int value = arr3[index];
//             if(temp < value){
//              temp = value;
//          }
//
//      }
//        System.out.println(temp);


        // Ques 4 Min value in the array

//        int[] arr4 = {34, 4, 5, -100, -3};
//        int n = arr4.length;
//        int minvalue = arr4[0];
//        for (int index = 0; index <= n - 1; index++) {
//            if (minvalue > arr4[index]) {
//                minvalue = arr4[index];
//
//            }
//        }
//        System.out.println(minvalue);

    }
}