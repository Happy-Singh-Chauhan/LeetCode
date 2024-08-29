class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int[] arr=new int[queries.length];
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == x){
                list.add(i);
            }
        }
        for(int i=0;i<queries.length;i++){
            if(queries[i] <= list.size()){
                arr[i]=list.get(queries[i]-1);
            }
            else{
                arr[i]=-1;
            }
        }
        return arr;
    }
}