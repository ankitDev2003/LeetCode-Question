class Solution {
    public int maxArea(int[] height) {

        int minValue = Integer.MIN_VALUE;

        int end = height.length - 1;
        int start = 0;

        while(start < end){

           minvalue = Math.max(minvalue,(end - i ) * Math.min(height[start],height[end]));


             if(height[start] <= height[end]){

               start++;

             }
             else {

               end--;

             }

        }

        return minValue;


    }
}


// Another way

class Solution {
    public int maxArea(int[] height) {
        
       int start = 0;

       int end = height.length - 1;

       int ans = Integer.MIN_VALUE;


       while(start < end){
       
           
           if(height[start] <= height[end]){
            
               int area = height[start] * (end - start);

               ans = Math.max(ans,area);

               while(start < height.length - 1 && height[start + 1] <= height[start]){
                  start++;
               } 

               start++;
           }

           else if(end >= 0 && height[end] < height[start]){

                int area = height[end] * (end - start);
                ans = Math.max(ans,area);

                while(height[end-1] <= height[end]){
                    end--;
                }

                end--;
           }


       } 

       return ans;
       
    }
}
