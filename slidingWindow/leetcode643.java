class Solution {

    public double findMaxAverage(int[] nums, int k) {
        int size = nums.length;
        int start = 0;

        double ans = Double.NEGATIVE_INFINITY;
        double total = 0;

        for (int end = 0; end < size; end++) {
            total += (double) nums[end];

            if (end - start + 1 > k) {
                total -= (double) nums[start];
                start++;
            }
            if (end - start + 1 == k) {
                ans = Math.max(ans, total / k);
            }
        }

        return ans;
    }
}
