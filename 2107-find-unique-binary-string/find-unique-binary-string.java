class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<nums.length;i++){
            sb.append((nums[i].charAt(i) == '1')? '0':'1');
        }
        return sb.toString();
    }
}