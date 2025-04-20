class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<answers.length;i++){
            if(answers[i] == 0){
                count++;
                continue;
            }
            if(!map.containsKey(answers[i]) || map.get(answers[i]) == 0){
                map.put(answers[i],answers[i]);
                count+=answers[i]+1;
            }
            else{
                map.put(answers[i],map.get(answers[i])-1);
            }
        }
        return count;
    }
}