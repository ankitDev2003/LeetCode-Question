class Solution {

     // Memoization + to down dp
    // public int fibo(int n, int[] memo){
    //     if(n < 2) return n;

    //     if(memo[n] != -1) return memo[n];

    //     return memo[n] = fibo(n-1,memo) + fibo(n-2,memo);
    // }



   // bottom up tabulation
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
