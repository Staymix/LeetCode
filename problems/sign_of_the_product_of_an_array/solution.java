class Solution {
    public int arraySign(int[] nums) {
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            }
            if (nums[i] < 0) {
                if (result < 0) {
                    result = 1;
                } else {
                    result = -1;
                }
            }
        }
        return result;
    }
}