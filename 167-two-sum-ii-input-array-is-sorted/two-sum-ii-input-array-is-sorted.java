class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] arr={-1,-1};
        int s=0;
        int e=numbers.length-1;
        while(s<e){
            int mid=(s+e)/2;
            int sum=numbers[s]+numbers[e];
            if(sum == target){
                arr[0]=s+1;
                arr[1]=e+1;
                break;
            }
            if(sum<target){
                if(numbers[mid]+numbers[e]<target){
                   s=mid+1; 
                }
                else{
                   s++; 
                }
            }
            else{
                if(numbers[mid]+numbers[s]>target){
                    e=mid-1;
                }
                else{
                    e--;
                }
            }
        }
        return arr;
    }
}