class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String word:strs){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String sorted=new String(chars);
            if(!map.containsKey(sorted)){
                map.put(sorted,new ArrayList<>());
            }
            map.get(sorted).add(word);
        }
        return new ArrayList<>(map.values());
    }
}