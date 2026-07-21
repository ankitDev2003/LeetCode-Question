class Solution {


   public int house1(int[] nums, int i, int[] memo1){

       if(i >= nums.length - 1) return 0;

       if(memo1[i] != -1) return memo1[i];

       int left = nums[i] + house1(nums,i+2,memo1);
       int right = house1(nums,i+1,memo1);

       memo1[i] = Math.max(left,right);

       return memo1[i];
   }


  public int house2(int[] nums, int i, int[] memo2){

       if(i >= nums.length) return 0;

       if(memo2[i] != -1) return memo2[i];

       int left = nums[i] + house2(nums,i+2,memo2);
       int right = house2(nums,i+1,memo2);

       memo2[i] = Math.max(left,right);

       return memo2[i];

  }

    public int rob(int[] nums) {

        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);

        int memo1[] = new int[nums.length];
        Arrays.fill(memo1,-1);
        int memo2[] = new int[nums.length];
        Arrays.fill(memo2,-1);

        return Math.max(house1(nums,0,memo1),house2(nums,1,memo2));
    }
}


////

// Tabulation

 class Solution {
     

     public int robber(int[] nums, int start, int end){
         
         int len = end - start + 1;

         int[] dp = new int[len+1];
         
         // Defining state
         dp[0] = 0;
         dp[1] = nums[start];

         for(int i = 2; i <= len; i++){
            dp[i] = Math.max(nums[start + i - 1] + dp[i-2], dp[i-1]);
         }

       return dp[len];

     }

    
    public int rob(int[] nums) {

        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0],nums[1]);

        int n = nums.length;

        return Math.max(robber(nums,0,n-2),robber(nums,1,n-1));
         
    }
}
