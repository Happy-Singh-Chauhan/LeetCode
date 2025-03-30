class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list=new ArrayList<>();
        int[] arr=new int[26];
        int start=0,end=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            end=Math.max(end,arr[s.charAt(i)-'a']);
            if(i == end){
                list.add(end-start+1);
                start=i+1;
            }
        }
        return list;
    }
}