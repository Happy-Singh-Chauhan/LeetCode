class Solution {
    public int minMaxDifference(int num) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        String s=num+"";
        for(char c:s.toCharArray()){
            char ch='9';
            String str=s.replace(c,ch);
            max=Math.max(max,Integer.parseInt(str));
            String str1=s.replace(c,'0');
            min=Math.min(min,Integer.parseInt(str1));
        }
        return max-min;
    }
}