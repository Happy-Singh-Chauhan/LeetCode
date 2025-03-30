class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        int start=0,end=0;
        for(char c:s.toCharArray()){
            if(map.containsKey(c))continue;
            map.put(c,s.lastIndexOf(c));
        }
        for(int i=0;i<s.length();i++){
            end=Math.max(end,map.get(s.charAt(i)));
            if(i == end){
                list.add(end-start+1);
                start=i+1;
            }
        }
        return list;
    }
}