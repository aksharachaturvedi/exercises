package LeetCode;

/**
 Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321
 */

public class ReverseInt {
    public static int reverse(int x) {
        Boolean isneg = false, zero=false;
        if (x < 0) {
            isneg = true;
            x = -x;
        }
        int result = 0;
        while (x > 0) {
            result = result * 10 + (x % 10);
            x = x / 10;
            if(x==0){
                zero=true;
            }
        }
        if (isneg) {
            result = result * (-1);
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(reverse(1000000004));
    }
}
