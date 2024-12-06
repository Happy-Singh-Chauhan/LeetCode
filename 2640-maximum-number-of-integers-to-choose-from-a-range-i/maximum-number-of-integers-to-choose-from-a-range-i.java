class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> set=new HashSet<>();
        for(int m:banned){
            set.add(m);
        }
        
        int count=0;
        for(int i=1;i<=n;i++){
            if(set.contains(i)){
                continue;
            }
            maxSum-=i;
            if(maxSum<0) break;
            count++;
            
        }
        return count;
    }
}