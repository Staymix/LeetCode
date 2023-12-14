class Solution {
    public String longestCommonPrefix(String[] strs) {
        List<char[]> charactersArrays = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            charactersArrays.add(strs[i].toCharArray());
        }
        int minIndex = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < min) {
                min = strs[i].length();
                minIndex = i;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < strs[minIndex].length(); i++) {
            char alter = 0;
            boolean flag = false;
            int count = 0;
            for (char[] chars : charactersArrays) {
                if (count > 0) {
                    if (alter != chars[i]) {
                        flag = true;
                        break;
                    }
                }
                alter = chars[i];
                count++;
            }
            if (flag) {
                break;
            }
            result.append(alter);
        }
        return result.toString();
    }
}