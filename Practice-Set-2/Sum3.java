package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by rbabbar on 8/19/14.
 */
public class Sum3 {

    public static ArrayList<List<Integer>> threeSum(int[] num) {
        ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();

        Arrays.sort(num);
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || num[i] > num[i - 1]) {

                int neg = -num[i];
                int start = i + 1;
                int end = num.length - 1;
                while (start < end) {
                    if (num[start] + num[end] < neg) {
                        start++;
                    } else if (num[start] + num[end] > neg) {
                        end--;
                    } else {
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(num[i]);
                        temp.add(num[start]);
                        temp.add(num[end]);
                        result.add(temp);

                        start++;
                        end--;
                        //avoid duplicate solutions
                        while (start < end && num[end] == num[end + 1])
                            end--;

                        while (start < end && num[start] == num[start - 1])
                            start++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args){

        int[] numbers = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>>  results = threeSum(numbers);
       for(List<Integer> result: results) {
           for (Integer i : result) {
               System.out.print(i + ",");
           }
           System.out.println("");
       }
    }
}
