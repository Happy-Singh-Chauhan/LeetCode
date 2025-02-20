class Solution {
    public boolean canWePlace(int[] position,int dist,int m){
        int cnt=1;
        int last=position[0];
        for(int i=0;i<position.length;i++){
            if(position[i]-last >= dist){
                cnt++;
                last=position[i];
            }
        }
        return cnt >= m;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=0;
        int high=(position[position.length-1]-position[0])/(m-1);
        int ans=1;
        while(low <= high){
            int mid=low+(high-low)/2;
            if(canWePlace(position,mid,m)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
}