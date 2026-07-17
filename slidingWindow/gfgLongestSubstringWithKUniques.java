import java.util.HashMap;

class Solution {
    public int longestKSubstr(String s, int k) {

        // HashMap
        HashMap<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        int ans = -1;
        int start = 0;

       for(int end = 0; end < arr.length; end++){

           map.put(arr[end],map.getOrDefault(arr[end],0) + 1);

           if(map.size() == k){
               ans = Math.max(ans,end - start + 1);
           }

           while(map.size() > k){
               map.put(arr[start],map.get(arr[start]) - 1);
                if(map.get(arr[start]) == 0){
                    map.remove(arr[start]);
                }
               start++;
           }
       }

       return ans;
    }
}
