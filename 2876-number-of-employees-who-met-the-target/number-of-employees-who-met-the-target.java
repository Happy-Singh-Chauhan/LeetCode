class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int result = 0;
        for (int hour : hours) {
            if (hour >= target) {
                result++;
            }
        }
        return result;
    }
}