public class Recursion1 {

    //Ques1 - Traversing Array using Recursion

//    static void printArray(int[] arr, int i) {
//        //base case
//        if (i >= arr.length) {
//            return;
//        }
//        //processing
//        System.out.println(arr[i]);
//        //Rc
//        printArray(arr, i + 1);
//    }


    //Ques 2 , MAx element in an array
    static int maxElement(int[] arr, int i, int maxii ){
        //base case
        if(i >= arr.length ){
            return maxii;
        }
         //processing
        if(arr[i] > maxii){
            maxii = arr[i];
        }
        //RC
     return   maxElement(arr , i+1, maxii);
    }

    public static void main(String[] args) {
   int[] arr = { -12 , -32 ,-243 , -87 , -234};
    int i = 0;
    int maxii = Integer.MIN_VALUE;

   int result =  maxElement(arr,i,maxii);
        System.out.println(result);

    }
}