/**
 * Given a non-empty special binary tree consisting of nodes with the non-negative value, 
 * where each node in this tree has exactly two or zero sub-node. 
 * If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes. 
 * Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree. 
 * If no such second minimum value exists, output -1 instead.
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * @author Atara Weinreb
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
       ArrayList<Integer> x = new ArrayList<>();
       rec(x, root);
       if (x.size() < 2)
           return -1;
       Collections.sort(x);
       int temp = x.get(0);
       for (int i = 0; i < x.size(); i++) {
           if (temp < x.get(i))
               return x.get(i);
       }
       return -1;
    }
    private void rec(ArrayList<Integer> x, TreeNode root) {
        if (root != null) {
            x.add(root.val);
            rec(x, root.left);
            rec(x, root.right);
        }
    }
}
