class Solution {
    public String getHint(String secret, String guess) {
        int[] number=new int[10];
        int cows=0;
        int bulls=0;

        for(int i=0;i<secret.length();i++){
            int s=secret.charAt(i)-'0';
            int g=guess.charAt(i)-'0';

            if(s == g){
                bulls++;
            }
            else{
                if(number[s] < 0){
                    cows++;
                }
                if(number[g] > 0){
                    cows++;
                }
                number[s]++;
                number[g]--;
            }
        }
        
        return bulls + "A" + cows + "B";
    }
}