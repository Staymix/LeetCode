class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target && count < target || nums[i] == target) {
                return i;
            } else {
                count = nums[i];
            }
        }
        return nums[nums.length - 1] < target ? nums.length : 0;
    }
}