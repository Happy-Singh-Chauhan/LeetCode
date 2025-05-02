class Solution {
    public String pushDominoes(String dominoes) {
        int n=dominoes.length();
        int[] left=new int[n];
        int[] right=new int[n];
        StringBuilder sb=new StringBuilder();
        int nearLeft=-1;
        for(int i=n-1;i>=0;i--){
            if(dominoes.charAt(i) == 'R')nearLeft=-1;
            else if(dominoes.charAt(i) == 'L')nearLeft=i;
           left[i]=nearLeft;
        }
        int nearRight=-1;
        for(int i=0;i<n;i++){
            if(dominoes.charAt(i) == 'L')nearRight=-1;
            else if(dominoes.charAt(i) == 'R')nearRight=i;
            right[i]=nearRight;
        }
        for(int i=0;i<n;i++){
            if(left[i] == -1 && right[i] == -1)sb.append('.');
            else{
                if(left[i] == -1)sb.append('R');
                else if(right[i] == -1)sb.append('L');
                else{
                    if(Math.abs(right[i] - i) > Math.abs(i - left[i]))sb.append('L');
                    else if(Math.abs(right[i] - i) < Math.abs(i - left[i]))sb.append('R');
                    else sb.append('.');
                }
            }
        }
        return sb.toString();
    }
}