class Solution {
    public int maxCoins(int[] piles) {
        if(piles.length == 3)return piles[1];
        Arrays.sort(piles);
        int left=0;
        int right=piles.length-2;
        int sum=0;
        while(left < right){
            sum+=piles[right];
            left++;
            right-=2;
        }
        return sum;
    }
}