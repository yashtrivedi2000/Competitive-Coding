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
    public boolean isValidBST(TreeNode root) {
        
        return isBinaryTree(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
    }
    public boolean isBinaryTree(TreeNode root, int min, int max){
        if (root == null)
            return true;
        if (root.val < min || root.val > max)
            return false;
        if(root.val==Integer.MIN_VALUE && root.left!=null)
                return false;
        if(root.val==Integer.MAX_VALUE && root.right!=null)
            return false;
        
        return isBinaryTree(root.left, min, root.val - 1) && isBinaryTree(root.right, root.val + 1, max);
    }
}
