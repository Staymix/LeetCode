class Solution {
    public int romanToInt(String s) {
        String[] strings = s.split("");
        int sum = 0;
        int count = 0;
        for (int j = 0; j < strings.length; j++) {
            switch (strings[j]) {
                case "I":
                    sum += 1;
                    count = 1;
                    break;
                case "V":
                    if (count < 5) {
                        sum += 5 - (count * 2);
                    } else {
                        sum += 5;
                    }
                    count = 5;
                    break;
                case "X":
                    if (count < 10) {
                        sum += 10 - (count * 2);
                    } else {
                        sum += 10;
                    }
                    count = 10;
                    break;
                case "L":
                    if (count < 50) {
                        sum += 50 - (count * 2);
                    } else {
                        sum += 50;
                    }
                    count = 50;
                    break;
                case "C":
                    if (count < 100) {
                        sum += 100 - (count * 2);
                    } else {
                        sum += 100;
                    }
                    count = 100;
                    break;
                case "D":
                    if (count < 500) {
                        sum += 500 - (count * 2);
                    } else {
                        sum += 500;
                    }
                    count = 500;
                    break;
                case "M":
                    if (count < 1000) {
                        sum += 1000 - (count * 2);
                    } else {
                        sum += 1000;
                    }
                    count = 1000;
                    break;
            }
        }
        return sum;
    }
}