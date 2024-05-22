import java.util.Arrays;

public class Fibonacci {
    static int[] result;
    public static void main(String[] args) {
        int n=4;
        result=new int[n+1];

        getFibonacciNumber(4);
        System.out.println(Arrays.toString(result));
    }
    public static int  getFibonacciNumber(int n){
        if (n<0){
            return -1;
        }
        if (n==0 || n==1){
            return n;
        }
        int fibonacciNumber=getFibonacciNumber(n-1)+getFibonacciNumber(n-2);
        result[n]=fibonacciNumber;
        return fibonacciNumber;
    }
}
