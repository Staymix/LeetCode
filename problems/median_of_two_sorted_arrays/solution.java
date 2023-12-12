class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merge, 0, nums1.length);
        System.arraycopy(nums2, 0, merge, nums1.length, nums2.length);
        Arrays.sort(merge);
        int size = merge.length;
        if (((double) merge.length / 2) % 1 == 0) {
            return (double) (merge[(size / 2) - 1] + merge[size / 2]) / 2;
        }
        return merge[size / 2];
    }
}