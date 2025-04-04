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
    public int maximumDepth(TreeNode root){
        if(root == null)return 0;
        int left=maximumDepth(root.left);
        int right=maximumDepth(root.right);
        return Math.max(left,right)+1;
    }
    public TreeNode dfs(TreeNode root,int maxDepth,int currDepth){
        if(root == null)return null;
        if(currDepth == maxDepth-1)return root;
        TreeNode left=dfs(root.left,maxDepth,currDepth+1);
        TreeNode right=dfs(root.right,maxDepth,currDepth+1);
        if(left != null && right != null)return root;
        if(left != null)return left;
        return right;
    }
    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        int maxDepth=maximumDepth(root);
        int currDepth=0;
        return dfs(root,maxDepth,currDepth);
    }
}