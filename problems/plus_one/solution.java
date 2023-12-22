class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (true) {
            if (digits[i] == 9) {
                if (i - 1 == -1) {
                    digits[i] = 1;
                    int[] result = new int[digits.length + 1];
                    System.arraycopy(digits, 0, result, 0, digits.length);
                    result[digits.length] = 0;
                    return result;
                } else {
                    digits[i] = 0;
                    i--;
                }
            } else {
                digits[i]++;
                break;
            }
        }
        return digits;
    }
}