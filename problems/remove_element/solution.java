class Solution {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        int length = nums.length;
        int i = 0;
        while (i < length) {
            if(nums[i] == -1) break;
            if (nums[i] == val) {
                nums[i] = nums[length - 1];
                nums[--length] = -1;
                continue;
            }
            result++;
            i++;
        }
        return result;
    }
}