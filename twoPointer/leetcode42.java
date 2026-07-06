class Solution {
    public int trap(int[] height) {
        
      int start = 0;
      int end = height.length - 1;

      int leftMax = Integer.MIN_VALUE;
      int rightMax = Integer.MIN_VALUE;
      int count = 0;

      while(start < end){
          
         leftMax = Math.max(leftMax,height[start]);
         rightMax = Math.max(rightMax,height[end]);

       
          if(height[start] <= height[end]){
            count += Math.min(leftMax,rightMax) - height[start];
            start++;
         }

         else{
             count += Math.min(leftMax,rightMax) - height[end];
             end--;
         }

      }

       return count;
    }
}
