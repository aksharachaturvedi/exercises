package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rbabbar on 8/21/14.
 */
public class SpiralMatrixPrint {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();

        if(matrix == null || matrix.length == 0) return result;

        int row = matrix.length;
        int col = matrix[0].length;
        int rcount = 0, ccount = 0;
        while (row > 0 && col > 0) {
            //inner most layer
            if (row == 1) {
                for (int i=0; i < col; i++) {
                    result.add(matrix[rcount][ccount++]);
                }
                break;
            } else if (col == 1) {
                for (int i=0; i < row; i++) {
                    result.add(matrix[rcount++][ccount]);
                }
                break;
            }
            //top -> rigth
            for (int i=0; i < col - 1; i++)
                result.add(matrix[rcount][ccount++]);

            //right --> right_bottom
            for (int i=0;  i < row - 1; i++)
                result.add(matrix[rcount++][ccount]);

            //right_bottom -->left_bottom
            for (int i=0; i < col-1 ; i++)
                result.add(matrix[rcount][ccount--]);

            //left ==> inner
            for (int i=0; i < row-1 ; i++)
                result.add(matrix[rcount--][ccount]);

            rcount++;
            ccount++;
            row = row - 2;
            col = col - 2;
        }
        return result;
    }

    public static void main(String[] args){
        int[][]mat =
         {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11,12},
                {13,14, 15,16}
        };

        for(Integer i:spiralOrder(mat)){
            System.out.print(i +",");
        }
    }

}
