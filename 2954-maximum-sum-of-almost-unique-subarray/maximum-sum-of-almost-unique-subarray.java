class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        long maxSum=0;
        long currentSum=0;
        int left=0;
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int right=0;right<nums.size();right++){
            int currentElement=nums.get(right);
            freqMap.put(currentElement,freqMap.getOrDefault(currentElement,0)+1);
            currentSum+=currentElement;


            while(right - left + 1 > k){
                int leftElement=nums.get(left);
                freqMap.put(leftElement,freqMap.get(leftElement)-1);
                if(freqMap.get(leftElement) == 0){
                    freqMap.remove(leftElement);
                }
                currentSum-=leftElement;
                left++;
            }

            if(freqMap.size() >= m){
                maxSum=Math.max(maxSum,currentSum);
            }
        }
        return maxSum;
    }
}