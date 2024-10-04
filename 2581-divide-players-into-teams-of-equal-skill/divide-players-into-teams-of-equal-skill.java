class Solution {
    public long dividePlayers(int[] skill) {
        if(skill.length == 2){
            return skill[0]*skill[1];
        }
        Arrays.sort(skill);
        int start=1;
        int end=skill.length-2;
        Map<Integer,Integer> map=new HashMap<>();
        map.put((skill[start-1]+skill[end+1]),0);
        long total=skill[start-1]*skill[end+1];
        while(start<end){
            int pos=skill[start]+skill[end];
            if(map.containsKey(pos)){
            total+=skill[start]*skill[end];
            start++;
            end--;
            }
            else{
                return -1;
            }
        }
        return total;
    }
}