package LeetCode;

import com.careercups.Chapter_4.TreeNode;
//https://coderpad.io/7H2THEQD

/**
 * Created by rbabbar on 8/21/14.
 */
public class BstArray {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length < 1) return null;
        if (num.length == 1) {
            TreeNode root = new TreeNode(num[0]);
            return root;
        }
        return sortedArrayToBst(num, 0, num.length - 1);
    }

    public TreeNode sortedArrayToBst(int[] num, int lo, int hi) {
        int mid = lo + (hi - lo) / 2;
        TreeNode root = new TreeNode(num[mid]);
        root.left = sortedArrayToBst(num, lo, mid - 1);
        root.right = sortedArrayToBst(num, mid + 1, hi);

        return root;

    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};
        //TreeNode node = new TreeNode();
        // TreeNode rot= sortedArrayToBST(numbers);
        System.out.println("");
    }
}
