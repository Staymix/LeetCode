class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (numbers.containsKey(nums[i])) {
                count += numbers.get(nums[i]);
            }
            numbers.put(nums[i], count);
        }
        int maxNum = Integer.MIN_VALUE;
        int maxCount = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (maxCount < entry.getValue()) {
                maxCount = entry.getValue();
                maxNum = entry.getKey();
            }
        }
        return maxNum;
    }
}