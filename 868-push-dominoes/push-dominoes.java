class Solution {
    public String pushDominoes(String dominoes) {
        int n=dominoes.length();
        int[] left=new int[n];
        int[] right=new int[n];
        StringBuilder sb=new StringBuilder();
        if(dominoes.charAt(dominoes.length()-1) == 'L'){
            left[n-1]=n-1;
        }
        else left[n-1]=-1;
        for(int i=n-2;i>=0;i--){
            if(dominoes.charAt(i) == 'R')left[i]=-1;
            else if(dominoes.charAt(i) == 'L')left[i]=i;
            else{
                if(left[i+1] != -1)left[i]=left[i+1];
                else left[i]=-1;
            }
        }
        if(dominoes.charAt(0) == 'R'){
            right[0]=0;
        }
        else right[0]=-1;
        for(int i=1;i<n;i++){
            if(dominoes.charAt(i) == 'L')right[i]=-1;
            else if(dominoes.charAt(i) == 'R')right[i]=i;
            else{
                if(right[i-1] != -1)right[i]=right[i-1];
                else right[i]=-1;
            }
        }
        for(int i=0;i<n;i++){
            if(left[i] == -1 && right[i] == -1)sb.append('.');
            else{
                if(left[i] == -1 && right[i] != -1)sb.append('R');
                else if(right[i] == -1 && left[i] != -1)sb.append('L');
                else{
                    if(Math.abs(right[i] - i) > Math.abs(i - left[i]))sb.append('L');
                    else if(Math.abs(right[i] - i) < Math.abs(i - left[i]))sb.append('R');
                    else sb.append('.');
                }
            }
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return sb.toString();
    }
}