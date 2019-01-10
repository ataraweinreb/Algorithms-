/**
 * Given a binary tree and a sum,
 * determine if the tree has a root-to-leaf path 
 * such that adding up all the values along the path equals the given sum.
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
 
class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        return help(root, 0, sum); 
    }
    
    public boolean help(TreeNode node, int count, int sum) {
        if (node.left == null && node.right == null) {
            count += node.val;  
            if (count == sum) 
                return true;
            else 
                return false;
        }
        else {
            if (node.left != null && node.right != null) {
                return help(node.left, count + node.val, sum) || help(node.right, count + node.val, sum);
            }
            else if (node.left != null) {
                 return help(node.left, count + node.val, sum);
            }
            else 
                return help(node.right, count + node.val, sum);
        }
    }
}
