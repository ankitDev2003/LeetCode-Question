class Solution {

    public int maxSubarraySum(int[] arr, int k) {
        int size = arr.length;
        int start = 0;

        int ans = Integer.MIN_VALUE;
        int total = 0;

        for (int end = 0; end < size; end++) {
            int window = end - start + 1;

            total += arr[end];

            if (window > k) {
                total -= arr[start];
                start++;
            }

            ans = Math.max(ans, total);
        }

        return ans;
    }
}
