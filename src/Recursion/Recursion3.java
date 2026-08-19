package Recursion;

public class Recursion3 {

   // Ques: count elements in an array
    static int countElements(int[] arr, int i , int count){
        //base case
        if(i>= arr.length){
            return count;
        }

        //processing

            count = count + 1;
        //Rc
       return countElements(arr, i+1, count);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int i =0;
        int count =0;
        int result = countElements(arr,i,count);
        System.out.println(result);
    }
}
