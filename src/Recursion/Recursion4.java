package Recursion;

public class Recursion4 {

    //Ques: Print the individual digit of a number givem
    static void printDigit(int num){
        if(num ==0){
            return;
        }

        //processing
         int digit = num;
       digit  =  digit % 10;
        num = num  / 10;

      //rc
        printDigit(num);
        System.out.println(digit);

    }

    public static void main(String[] args) {
        printDigit(123);
    }
}
