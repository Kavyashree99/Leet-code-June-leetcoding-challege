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
    public int sumNumbers(TreeNode root) {
        return cal(0, root);
    }
    int cal(int curr, TreeNode root){
        if(root == null) return 0;
        curr = (10*curr) + root.val;
        if(root.left == null && root.right == null)  return curr;
        return cal(curr, root.left) + cal(curr, root.right);        
    }
}
