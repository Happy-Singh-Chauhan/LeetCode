class Solution {
    public boolean canDistribute(int[] quantities,int mid,int n){
        int j=0;
        int remaining=quantities[j];
        for(int i=0;i<n;i++){
            if(remaining <= mid){
                j++;
                if(j == quantities.length){
                    return true;
                }
                else{
                    remaining=quantities[j];
                }
            }
            else{
                remaining-=mid;
            }
        }
        return false;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int left=0;
        int right=0;
        for(int max:quantities){
            if(max>right){
                right=max;
            }
        }
        while(left < right){
            int mid=left+(right-left)/2;
            if(canDistribute(quantities,mid,n)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}