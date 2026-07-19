class Solution {

     public int recu(int[] nums, int i,int[] memo){

         if(i >= nums.length) return 0;

         if(memo[i] != -1) return memo[i];

         int left = nums[i] + recu(nums,i+2,memo);
         int right = recu(nums,i+1,memo);

         memo[i] = Math.max(left,right);

         return memo[i];
     }

    public int rob(int[] nums) {

        int[] memo = new int[nums.length + 1];
        Arrays.fill(memo,-1);

        return recu(nums,0,memo);

    }
}



// Tabulation method
class Solution {
    public int rob(int[] nums) {

        if(nums.length == 1) return nums[0];

        int[] dp = new int[nums.length+1];

        // Defining state
        dp[0] = 0;
        dp[1] = nums[0];

        for(int i = 2; i <= nums.length; i++){

             int steal = nums[i-1] + dp[i-2];
             int skip = dp[i-1];

             dp[i] = Math.max(steal,skip);
        }

        return dp[nums.length];

    }
}
