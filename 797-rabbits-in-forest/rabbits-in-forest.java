class Solution {
    public int numRabbits(int[] answers) {
        int n=answers.length;
        int max=0;
        for(int num:answers){
            max=Math.max(max,num);
        }
        int[] freq=new int[max+1];
        int count=0;
        for(int i=0;i<n;i++){
            if(answers[i] == 0){
                count++;
                continue;
            }
            if(freq[answers[i]] == 0){
                count+=answers[i]+1;
                freq[answers[i]]=answers[i];
            }
            else{
                freq[answers[i]]-=1;
            }
        }
        return count;
    }
}