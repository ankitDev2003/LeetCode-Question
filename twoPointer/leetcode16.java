class Solution {
    public int threeSumClosest(int[] arr, int target) {
        
     Arrays.sort(arr);
 
        int min = arr[0] + arr[1] + arr[arr.length - 1];

      for(int i = 0; i < arr.length - 2; i++){

           if(i > 0 && arr[i] == arr[i-1]) continue;

           int start = i+1;
           int end = arr.length - 1;

           while(start < end){

              int sum = arr[i] + arr[start] + arr[end];
              
              if(sum == target) return target;
              
              if(Math.abs(target - sum) < Math.abs(target - min)){
                min = sum;
              }
            
               if(sum > target){
                end--;
              }

             else {
                start++;
             }  
           }
      }
  
     return min;

    }
}
