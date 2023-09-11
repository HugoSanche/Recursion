//How to find the sum of digits of a positive integer number using recursion?
//10->  10/10=1 and Remainder=0
//54->  54/10=5 and Remainder=4
//112-> 112/10=11 and Remainder=2
//       11/10=1 and Remainder=1

//      175/10=17  and Reminder=5
//      17/10=1 and reminder=7

public class Questions {
    public int sumofDifitis(int n){
        if(n<0 || n==0) {
            return 0;
        }
        return (n%10) +sumofDifitis(n/10);
    }
}





