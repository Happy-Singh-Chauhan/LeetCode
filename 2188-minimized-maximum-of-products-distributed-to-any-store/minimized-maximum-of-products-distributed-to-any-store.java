class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int left=1;
        int right=0;
        for(int max:quantities){
            right=Math.max(max,right);
        }
        int ans=0;
        while(left <= right){
            int mid=left+(right-left)/2;
            int count=0;
            for(int a:quantities){
                count+=(a % mid == 0)? a/mid : (a/mid)+1;
                if(count > n){
                    break;
                }
            }
            if(count <= n){
                ans=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return ans;
    }
}