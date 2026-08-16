import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {

//        brr[0] = 1;
//        brr[1] = 2;
//        brr[2] = 3;
//         int n = brr.length;
//        for (int i = 0; i <= n-1; i++) {
//            brr[i] = i + 10;
//            System.out.println(brr[i] + " ");
//        }

//        for(int mybrr : brr){
//            System.out.println(mybrr);
//        }
        int[] brr = new int[3];
        Scanner input = new Scanner(System.in);

        int n = brr.length;
        //input in array use for loop
        for(int i = 0; i<= n-1; i++){
            System.out.println("Enter the elements of our array"  );
           brr[i] = input.nextInt();
        }
        //verify our input therefore printing an array use for each
        System.out.println("Your array is as follow  ");
        for(int var: brr){
            System.out.println(var);
        }



    }
}
