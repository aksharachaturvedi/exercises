package LeetCode;

/**
 Given an array of integers, every element appears twice except for one. Find that single one.

 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory? */
public class SingleNumber {

    public static int singleNumber(int[] A) {
        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            temp = temp ^ A[i];
        }
        return temp;
    }

    public static void main(String[] args){

        int[] numbers = {7, 2, 7, 11, 2, 15, 15};
        int r = singleNumber(numbers);
        System.out.println(r);
    }
}
