package com.exp.zsq.leetcode;

/**
 * 示例 1：
 *
 *
 * 输入：root = [10,5,15,3,7,null,18], low = 7, high = 15
 * 输出：32
 * https://leetcode-cn.com/problems/range-sum-of-bst/
 * @author zhaoshengqi
 * @date 2020/8/28 9:32 上午
 */
public class RangeSumBST {
    public static void main(String[] args) {

    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return 0;

        if (root.val < L) {
            return rangeSumBST(root.right,L,R);
        }
        if (root.val > R) {
            return rangeSumBST(root.left,L,R);
        }
        return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);

        /*int ls = rangeSumBST(root.left, L, R);

        if (root.val >= L && root.val <= R)
             ls += root.val;

        int rs = rangeSumBST(root.right, L,R);*/
    }

}
