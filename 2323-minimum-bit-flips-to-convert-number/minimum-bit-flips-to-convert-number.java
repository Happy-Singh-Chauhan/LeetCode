class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        int count=Integer.bitCount(ans);
        return count;
    }
}