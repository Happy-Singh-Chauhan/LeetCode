class Solution {
    public int maxDiff(int num) {
        String s=""+num;
        char c=s.charAt(0);
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(char ch:s.toCharArray()){
            String str1=s.replace(ch,'9');
            max=Math.max(max,Integer.parseInt(str1));
            if(ch != c){
                String str2=s.replace(ch,'0');
                min=Math.min(min,Integer.parseInt(str2));
            }
            else{
                String str2=s.replace(ch,'1');
                min=Math.min(min,Integer.parseInt(str2));
            }
        }
        return max-min;
    }
}