class Solution {
    public int maxAbsoluteSum(int[] nums) {

        // Maximum Kadane
        int sum1 = nums[0];
        int ans1 = nums[0];


        for(int i = 1; i < nums.length; i++){
            sum1 = Math.max(sum1 + nums[i],nums[i]);
            ans1 = Math.max(ans1,sum1);
        }


        // Mininum kadane
        int sum2 = nums[0];
        int ans2 = nums[0];

        for(int i = 1; i < nums.length; i++){
            sum2 = Math.min(sum2 + nums[i],nums[i]);
            ans2 = Math.min(ans2,sum2);
        }

        return Math.max(Math.abs(ans1),Math.abs(ans2));


    }
}
