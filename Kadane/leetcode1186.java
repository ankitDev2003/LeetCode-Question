class Solution {
    public int maximumSum(int[] arr) {


       long ans = arr[0];
       int noDel = arr[0];
       long oneDel = Integer.MAX_VALUE;

       for(int i = 1; i < arr.length; i++){

         oneDel = Math.max(noDel,oneDel + arr[i]);


         // Normal Kadane
         noDel = Math.max(arr[i],noDel+arr[i]);


         ans = Math.max(ans,Math.max(oneDel,noDel));

       }

       return (int) ans;
    }
}


// Almost same approach

class Solution {
    public int maximumSum(int[] arr) {
        
        
        int delete = 0;
        int noDelete = arr[0];
        int ans  = arr[0];

        for(int i = 1; i < arr.length; i++){

            int prev = noDelete;

            // Normal kadane
            noDelete = Math.max(noDelete+arr[i], arr[i]);

            // Dp
            delete = Math.max(prev,delete + arr[i]);


            ans = Math.max(ans,Math.max(noDelete,delete));
        }

         return ans;

    }
}
