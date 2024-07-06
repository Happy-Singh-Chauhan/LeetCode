class Solution {
    public int passThePillow(int n, int time) {
        int cycle=time/(n-1);
        int remaining=time % (n-1);
        int ans=0;
        if(cycle % 2 != 0){
            ans=n-remaining;
        }
        else{
            ans=remaining+1;
        }
        return ans;
    }
}