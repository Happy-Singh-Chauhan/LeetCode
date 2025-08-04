class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int maxSize=0;
        for(int num:fruits){
            maxSize=Math.max(maxSize,num);
        }
        int[] freq=new int[maxSize+1];
        int left=0;
        int cnt=0;
        int total=0;
        for(int right=0;right<n;right++){
            if(freq[fruits[right]] == 0){
            cnt++;
            }
            freq[fruits[right]]++;    
            while(cnt > 2){
                freq[fruits[left]]--;
                if(freq[fruits[left]] == 0){
                cnt--;
                }
                left++;
            }
            total=Math.max(total,right-left+1);
        }
        return total;
    }
}