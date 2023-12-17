class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 1;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (flag) break;
            int count = nums[i];
            flag = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (count != nums[j] && count < nums[j]) {
                    result++;
                    nums[i + 1] = nums[j];
                    flag = false;
                    break;
                }
            }
        }
        return result;

    }
}