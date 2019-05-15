/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        return helper(ans, root, 0);
    }
    private List<List<Integer>> helper(List<List<Integer>> ans, TreeNode root, int level) {
        if (root != null) {
            if (ans.size() <= level) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(root.val);
                ans.add(list);
            } 
            else {
                ans.get(level).add(root.val);
            }
            helper(ans, root.left, level + 1);
            helper(ans, root.right, level + 1);
        }
        return ans;
    }
}
