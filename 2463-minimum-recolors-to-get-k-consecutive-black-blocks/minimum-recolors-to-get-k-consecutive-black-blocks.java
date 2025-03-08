class Solution {
    public int minimumRecolors(String blocks, int k) {
      int left=0;
      int whiteColor=0;
      int recolor=Integer.MAX_VALUE;
      for(int right=0;right<blocks.length();right++){
        if(blocks.charAt(right) == 'W')whiteColor++;

        if((right-left+1) == k){
            recolor=Math.min(recolor,whiteColor);
            if(blocks.charAt(left) == 'W')whiteColor--;
            left++;
        }
      }
      return recolor;
    }
}