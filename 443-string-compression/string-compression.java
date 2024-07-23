class Solution {
    public int compress(char[] chars) {
        int i=1;
        int ans=0;
        int count=1;
        char v=chars[0];
        while(i<chars.length){
            if(v == chars[i]){
                count++;
            }
            else{
                v=chars[i];
                chars[ans++]=chars[i-1];
                if(count>1){
                    String str=String.valueOf(count);
                    for(char digit : str.toCharArray()){
                        chars[ans++]=digit;
                    }
                }
                count=1;
            }
            i++;
        }
         chars[ans++]=chars[i-1];
                if(count>1){
                    String str=String.valueOf(count);
                    for(char digit : str.toCharArray()){
                        chars[ans++]=digit;
                    }
                }
                return ans;
    }
}