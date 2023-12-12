class Solution {
    public int maxProduct(int[] nums) {
        int indexMax1 = 0;
        int max1 = Integer.MIN_VALUE;
        int indexMax2 = 0;
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max1 < nums[i]) {
                max1 = nums[i];
                indexMax1 = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (max2 <= nums[i] && indexMax1 != i) {
                max2 = nums[i];
                indexMax2 = i;
            }
        }
        return (nums[indexMax1] - 1) * (nums[indexMax2] - 1);
    }
}