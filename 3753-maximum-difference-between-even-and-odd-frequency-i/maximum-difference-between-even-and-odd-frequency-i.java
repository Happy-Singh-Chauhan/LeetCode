class Solution {
    public int maxDifference(String s) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        int maxOdd=0;
        int minEven=Integer.MAX_VALUE;
        for(int num:freq){
            if(num == 0)continue;
            if(num % 2 != 0)maxOdd=Math.max(maxOdd,num);
            else minEven=Math.min(minEven,num);
        }
        return maxOdd-minEven;
    }
}