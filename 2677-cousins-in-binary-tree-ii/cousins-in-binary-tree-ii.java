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
    public TreeNode replaceValueInTree(TreeNode root) {
        if(root == null){
            return null;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        List<Integer> list=new ArrayList<>();
        while(!queue.isEmpty()){
            int levelSize=queue.size();
            int sum=0;
            for(int i=0;i<levelSize;i++){
                TreeNode current=queue.poll();
                sum+=current.val;
                if(current.left != null){
                    queue.offer(current.left);
                }
                if(current.right != null){
                    queue.offer(current.right);
                }
            }
            list.add(sum);
        }
        queue.offer(root);
        int index=1;
        root.val=0;
        while(!queue.isEmpty()){
            int level=queue.size();
            for(int i=0;i<level;i++){
                TreeNode current=queue.poll();
                int cousin=(current.left != null ? current.left.val : 0)+(current.right != null ? current.right.val : 0);
                if(current.left != null){
                    current.left.val=list.get(index)-cousin;
                    queue.offer(current.left);
                }
                if(current.right != null){
                    current.right.val=list.get(index)-cousin;
                    queue.offer(current.right);
                }
            }
            index++;
        }
        return root;
    }
}