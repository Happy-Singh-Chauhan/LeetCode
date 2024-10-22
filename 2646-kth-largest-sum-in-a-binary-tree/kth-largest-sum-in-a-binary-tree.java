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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null){
            return -1;
        }
        List<Long> list=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int LevelSize=queue.size();
            long sum=0;
            for(int i=0;i<LevelSize;i++){
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
        if(k > list.size()) return -1;
        Collections.sort(list);
        return list.get(list.size()-k);
    }
}