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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        helper(answer, root, 1);
        return answer;
    }
    public List<List<Integer>> helper(List<List<Integer>> answer, TreeNode root, int level) {
        if (root != null) {
            if (answer.size() < level) {
                List<Integer> temp = new ArrayList<>();
                temp.add(root.val);
                answer.add(0, temp);
            }
            else {
                answer.get(answer.size() - level).add(root.val);
            }
            
            if (root.left != null) {
                helper(answer, root.left, level + 1);
            }
            if (root.right != null) {
                helper(answer, root.right, level + 1);
            }
        }
        return answer;
    }
}

 
