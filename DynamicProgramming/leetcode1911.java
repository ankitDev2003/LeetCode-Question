class Solution {

 public long altSum(int[] nums, int i,boolean flag){
      if(i == nums.length) return 0;


     // Skip case
     long skip = (long) altSum(nums, i,flag);
     long val = nums[i];
     if(flag == false){
         val = -val;
     }

    long take = val + altSum(nums, i, !flag);

    return Math.max(skip,take);

 }



    public long maxAlternatingSum(int[] nums) {

        boolean flag = true;

        altSum(nums, 0,flag);
    }
}
