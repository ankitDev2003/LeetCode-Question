class Solution {
   
 

    public int climb(int n, int[] memo){
        
     if(n < 0) return 0;
     if(n == 0) return 1;

     if(memo[n] != -1) return memo[n];

     int left = climb(n-1,memo);
     int right = climb(n-2,memo);

     return memo[n] = left + right; 

    }

    public  int climbStairs(int n) {
    
        int memo[] = new int[n+1];
        Arrays.fill(memo,-1);
        return climb(n,memo);
    }
}

// bottom up tabulation

 public  int climbStairs(int n) {
         
        if(n <= 2) return n;

         int dp[] = new int[n+1];

         dp[0] = 0;
         dp[1] = 1;
         dp[2] = 2;

         for(int i = 3; i < dp.length; i++){
            dp[i] = dp[i-1] + dp[i-2];
         }

         return dp[n];
    }
}
