class Solution {
    public boolean check(String s,String str){
       if(s.length() != str.length())return false;
       char[] arr1=s.toCharArray();
       char[] arr2=str.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       for(int i=0;i<arr1.length;i++){
        if(arr1[i] != arr2[i])return false;
       }
       return true;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<Integer,String> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            List<String> list=new ArrayList<>();
            if(map.containsKey(i))continue;
            list.add(strs[i]);
            map.put(i,strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(map.containsKey(j))continue;
                if(check(strs[i],strs[j])){
                    list.add(strs[j]);
                    map.put(j,strs[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}