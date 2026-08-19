package Arrays.TwoPointers;

public class Array_01 {

//     static void reverseArray(int[] arr) {
//         int n = arr.length;
//         int i =0;
//         int j = n - 1;
//        while(i <= j){
//            //swap , j-- and i++
//
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//
//            i++;
//            j--;
//        }
//        for(int k: arr){
//            System.out.println(k);
//        }
//     }
//     public static void main(String[] args) {
//        int[] arr = { 1 , 2 , 3 ,4 ,5};
//      reverseArray(arr);
//
//
//    }
//}


//Ques 2 Shifts the elements in array  by one position
//static void shiftElementsby1(int[] arr){
//int n = arr.length;
//int i = n-1 ;
//    int temp = arr[i];
//
//
//while( i > 0){
//    arr[i] = arr[i-1];
//    i--;
//
//}
//        arr[0] = temp;
//
//   for(int k: arr){
//       System.out.println(k);
//   }
//
//}
//public static void main(String[] args) {
//        int[] arr = { 10 , 20 ,30 , 40 ,50};
//        shiftElementsby1(arr);
//    }
//}


//Ques3 Print extreme elements in an alternative order
static void printExtremeelements(int[] arr){
    int n = arr.length;
int i =0;
int j = n-1;

 while(i <=j){

     if(i ==j){

         System.out.println(arr[i]);
     }
     else {
         System.out.println(arr[i]);
         System.out.println(arr[j]);
     }
     i++;
     j--;
 }
}
public static void main(String[] args) {
        int[] arr = { 1 , 2 ,3 ,4,  5, 6 };
        printExtremeelements(arr);
    }
}



