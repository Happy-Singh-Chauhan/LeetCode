class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n=0;
        long ans=0;
        while(n<k){
            Arrays.sort(gifts);
            gifts[gifts.length-1]=(int)Math.sqrt(gifts[gifts.length-1]);
            n++;
        }
        for(int m:gifts){
            ans+=m;
        }
        return ans;
    }
}