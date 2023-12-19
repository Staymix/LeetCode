class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        char[] max = (haystack.length() > needle.length() ? haystack : needle).toCharArray();
        char[] min = (haystack.length() <= needle.length() ? haystack : needle).toCharArray();
        boolean flag = false;
        int result = 0;
        int count = 0;
        for (int i = 0; i < max.length; i++) {
            if (max[i] == min[0]) {
                result = i;
                count = i;
                for (int j = 0; j < min.length; j++) {
                    if (max.length == count) {
                        return -1;
                    }
                    if (max[count] == min[j]) {
                        count++;
                        flag = true;
                    } else {
                        if (max.length - i >= min.length) {
                            flag = false;
                            break;
                        }
                        return -1;
                    }
                }
            }
            if (flag) break;
        }
        return !flag ? -1 : result;
    }
}