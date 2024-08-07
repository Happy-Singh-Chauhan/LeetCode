class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] f = new int[nums.length];
        int temp = 0;
        int temp2 = 1;
        for (int i = 0; i<nums.length; i++)
        {
           
            if(nums[i]>0)
            {
                f[temp] = nums[i];
                temp+=2;

                
            }
            else
            {
                f[temp2] = nums[i];
                temp2+=2;
    
            }
           

        }

        return f;
        
    }
}