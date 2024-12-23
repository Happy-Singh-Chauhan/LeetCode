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
    public int GetSwap(int[] arr){
        int swap=0;
        int[] target=arr.clone();
        Arrays.sort(target);

        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] != target[i]){
                swap++;

                int currPos=map.get(target[i]);
                map.put(arr[i],currPos);
                arr[currPos]=arr[i];
            }
        }
        return swap;
    }
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        int totalSwaps=0;

        while(!queue.isEmpty()){
            int size=queue.size();
            int[] arr=new int[size];

            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                arr[i]=node.val;
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
            }
            totalSwaps+=GetSwap(arr);
        }
        return totalSwaps;
    }
}