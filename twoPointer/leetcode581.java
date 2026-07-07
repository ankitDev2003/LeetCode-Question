class Solution {

    public int findUnsortedSubarray(int[] nums) {
        int end = -1;
        int start = -1;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < max) {
                end = i;
            }
            max = Math.max(max, nums[i]);
        }

        // End value

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > min) {
                start = i;
            }

            min = Math.min(min, nums[i]);
        }

        if (end == start) return 0;

        return end - start + 1;
    }
}
