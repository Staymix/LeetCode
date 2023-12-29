class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            int num = (columnNumber - 1) % 26;
            result.append((char) ('A' + num));
            columnNumber = (columnNumber - 1) / 26;
        }
        return result.reverse().toString();
    }
}