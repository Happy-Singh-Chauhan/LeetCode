class Solution {
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public boolean isDuplicate(int[] nums,int start,int end){
        for(int i=start;i<end;i++){
            if(nums[i] == nums[end])return true;
        }
        return false;
    }
    public void generate(int index,List<List<Integer>> ans,int[]nums){
        if(index == nums.length){
            List<Integer> list=new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            ans.add(list);
            return;
        }
        for(int i=index;i<nums.length;i++){
            if(isDuplicate(nums,index,i))continue;
            swap(nums,index,i);
            generate(index+1,ans,nums);
            swap(nums,index,i);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
     List<List<Integer>> ans=new ArrayList<>();
     generate(0,ans,nums);
     return ans;   
    }
}