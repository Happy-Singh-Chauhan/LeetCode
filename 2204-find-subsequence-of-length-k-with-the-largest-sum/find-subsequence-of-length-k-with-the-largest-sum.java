class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n=nums.length;
        if(n == k)return nums;
        int[][] pairs=new int[n][2];
        for(int i=0;i<n;i++){
            pairs[i][0]=nums[i];
            pairs[i][1]=i;
        }
        Arrays.sort(pairs,(a,b)->Integer.compare(b[0],a[0]));
        Arrays.sort(pairs,0,k,(a,b)->Integer.compare(a[1],b[1]));
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pairs[i][0];
        }
        return ans;
    }
}