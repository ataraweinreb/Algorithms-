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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        return helper(answer, root, 0);
    }
    public List<List<Integer>> helper( List<List<Integer>> ans, TreeNode root, int level) {
        if (root != null) {
            if (ans.size() <= level) {
                List<Integer> temp = new ArrayList<>();
                temp.add(root.val);
                ans.add(temp);
            }
            else { //our level is created 
                if (level % 2 == 0) {
                    ans.get(level).add(root.val);
                }
                else {
                    ans.get(level).add(0, root.val);
                }
            }
            helper(ans, root.left, level + 1);
            helper(ans, root.right, level + 1);
        }
        return ans;
    }
    
}
