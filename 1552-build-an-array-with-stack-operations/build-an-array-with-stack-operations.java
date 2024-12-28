class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list=new ArrayList<>();
        int a=1;
        int i=0;
        while(i<target.length){
            if(a == target[i]){
                list.add("Push");
                i++;
            }
            else{
                list.add("Push");
                list.add("Pop");
            }
            a++;
        }
        return list;
    }
}