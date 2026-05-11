class Solution {
    public int[] separateDigits(int[] nums) {
        String s="";
        for(int num:nums){
            s+=num;
        }
        int n=s.length();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.charAt(i)-'0';
        }
        return arr;
    }
}