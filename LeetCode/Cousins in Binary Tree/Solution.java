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
    public boolean isCousins(TreeNode root, int x, int y) {
        
     Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
        int size = queue.size();
        boolean xExist = false, yExist = false;
        for (int i=0; i<size; i++) {
            TreeNode tem = queue.poll();
            if (tem.val == x) {
                xExist = true;
            }
            if (tem.val == y) {
                yExist = true;
            }
            
            // it shows x & y cannot have the same parent
            if (tem.left != null && tem.right != null) {
                if (tem.left.val == x && tem.right.val == y) {
                    return false;
                }
                if (tem.left.val == y && tem.right.val == x) {
                    return false;
                }
            }
            if (tem.left != null) {
                queue.offer(tem.left);
            }
            if (tem.right != null) {
                queue.offer(tem.right);
            }
        }
        if (xExist && yExist) {
            return true;
        }
    }
    return false;
    }
}