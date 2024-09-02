class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long ans=0;
        while(k > 0){
            for(int i=0;i<chalk.length;i++){
                k-=chalk[i];
                if(k == 0){
                    ans=i+1;
                    if(ans == chalk.length){
                        return 0;
                    }
                    break;
                }
                if(k<0){
                    ans=i;
                    break;
                }
            }
        }
        return (int)ans;
    }
}