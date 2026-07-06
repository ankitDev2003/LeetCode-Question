class Solution {

    int countTriplets(int sum, int[] arr) {
        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i < arr.length - 2; i++) {
            int start = i + 1;
            int end = arr.length - 1;

            while (start < end) {
                int total = arr[start] + arr[i] + arr[end];

                if (total < sum) {
                    count += end - start;
                    start++;
                } else {
                    end--;
                }
            }
        }

        return count;
    }
}
