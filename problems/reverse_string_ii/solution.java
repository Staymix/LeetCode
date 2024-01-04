class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        if (chars.length > 2) {
            k = Math.min(chars.length, k);
            for (int i = 0; i < chars.length; i++) {
                int count = chars.length < i + k - 1 ? chars.length - 1 : i + k - 1;
                if (chars.length > count) {
                    for (int j = i; j < count; j++) {
                        char one = chars[j];
                        chars[j] = chars[count];
                        chars[count] = one;
                        count--;
                    }
                }
                i += (k * 2) - 1;
            }
        }
        return new String(chars);
    }
}