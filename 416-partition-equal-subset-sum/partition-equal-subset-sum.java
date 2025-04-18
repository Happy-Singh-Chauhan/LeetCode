class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        // find sum of all array elements
        for (int num : nums) {
            sum += num;
        }
        // if sum is odd, it cannot be partitioned into two equal subgroups
        if (sum % 2 != 0) return false;
        int subsetSum = sum / 2;
        int n = nums.length;
        // basically a map with complex index / subsetSum key
        Boolean[][] memo = new Boolean[n + 1][subsetSum + 1];
        return dfs(nums, n - 1, subsetSum, memo);
    }

    public boolean dfs(int[] nums, int n, int subsetSum, Boolean[][] memo) {
        if (subsetSum == 0)
            return true;
        if (n == 0 || subsetSum < 0)
            return false;
        if (memo[n][subsetSum] != null)
            return memo[n][subsetSum];
        boolean result = dfs(nums, n - 1, subsetSum - nums[n - 1], memo) ||
                dfs(nums, n - 1, subsetSum, memo);
        // store the result in memo
        memo[n][subsetSum] = result;
        return result;
    }
}