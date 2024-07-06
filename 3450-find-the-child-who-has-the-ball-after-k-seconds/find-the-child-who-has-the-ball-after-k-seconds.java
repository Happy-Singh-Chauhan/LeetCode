class Solution {
    public int numberOfChild(int n, int k) {
        int ans=0;
        int cycle=k/(n-1);
        int remaining=k%(n-1);
        if(cycle%2 !=0){
            ans=n-remaining;
        }
        else{
            ans=remaining+1;
        }
        return ans-1;
    }
}