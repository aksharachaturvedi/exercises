package LeetCode;

import java.util.HashMap;

/**
 * Created by rbabbar on 8/19/14.
 */
public class Sum2Problem {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        if(numbers.length >0){
            HashMap<Integer, Integer> hmap=new HashMap<Integer, Integer>();
            for(int i=0; i< numbers.length;i++){

                if(hmap.containsKey(numbers[i])){

                    int index = hmap.get(numbers[i]);
                    result[0] = index+1;
                    result[1] = i+1;
                }
                else{
                    hmap.put(target - numbers[i], i);
                }
            }
        }
        return result;
    }

    public static void main(String[] args){

        int target = 17;
        int[] numbers = {2, 7, 11, 15};
        int[] r = twoSum(numbers, target);
        System.out.println(r[0]+"--" +r[1]);
    }
}
