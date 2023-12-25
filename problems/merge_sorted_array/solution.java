class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[k];
            k++;
        }
        int result;
        while (true) {
            boolean flag = false;
            for (int i = 0; i < nums1.length; i++) {
                if (nums1.length != i + 1) {
                    if (nums1[i + 1] < nums1[i]) {
                        result = nums1[i];
                        nums1[i] = nums1[i + 1];
                        nums1[i + 1] = result;
                        flag = true;
                    }
                }
            }
            if (!flag) break;
        }
    }
}