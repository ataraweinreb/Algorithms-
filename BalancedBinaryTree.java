/**
 * Given a binary tree, determine if it is height-balanced.
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *
 * @author Atara Weinreb
 */
class BalancedBinaryTree {
    
    boolean result = true;
    
    public boolean isBalanced(TreeNode root) {
       depth(root);
       return result;
    }
    
    private int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        
        if (node.left == null && node.right == null) {
            return 1;
        }
        
        int leftPath = 1 + depth(node.left);
        int rightPath = 1 + depth(node.right);
        
        if (Math.abs(leftPath - rightPath) > 1) {
            result = false;
        }
        
        return Math.max(leftPath, rightPath);
    }
}

