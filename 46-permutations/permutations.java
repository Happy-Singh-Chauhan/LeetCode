class Solution {
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void permute(int index,List<List<Integer>> ans,int[] nums){
        if(index == nums.length){
            List<Integer> list=new ArrayList<>();
            for(int num:nums){
                list.add(num);
            }
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<nums.length;i++){
            swap(nums,index,i);
            permute(index+1,ans,nums);
            swap(nums,index,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        permute(0,ans,nums);
        return ans;
    }
}