/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return counts(root, Integer.MIN_VALUE); 
    }
    private Integer counts(TreeNode node , int maxSoFar){

        if(node == null)
            return 0;

        int count = (node.val >= maxSoFar) ? 1 : 0;
        maxSoFar = Math.max(node.val,maxSoFar);

        count += counts(node.left,maxSoFar);
        count += counts(node.right,maxSoFar);

        return count;


    }
}