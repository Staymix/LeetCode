class Solution {
    public int reverse(int x) {
        boolean flag = false;
        if (x < 0) {
            x *= -1;
            flag = true;
        }
        int result = 0;
        int count = 0;
        int factor = 1;
        while (x > 0) {
            count = x % 10;
            if (result > (Integer.MAX_VALUE - count) / 10) return 0;
            result *= factor;
            result += count ;
            x /= 10;
            factor = 10;
        }
        return flag ? result * -1 : result;
    }
}