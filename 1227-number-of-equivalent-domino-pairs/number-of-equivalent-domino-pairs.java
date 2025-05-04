class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int count=0;
        for(int i=0;i<dominoes.length;i++){
            int l=dominoes[i][0];
            int r=dominoes[i][1];
            for(int j=i+1;j<dominoes.length;j++){
                if(l == dominoes[j][0] && r == dominoes[j][1] || l == dominoes[j][1] && r == dominoes[j][0])count++;
            }
        }
        return count;
    }
}