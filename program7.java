Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
Example 1:
Input: nums = [3,2,3]
Output: [3]
Example 2:
Input: nums = [1]
Output: [1]



  Answer:
class Solution {
    public List<Integer> majorityElement(int[] nums) {
      Arrays.sort(nums);
      ArrayList<Integer> ans=new ArrayList<>();
      int c=1;
      int n=nums.length;
      for(int i=1;i<n;i++){
         if(nums[i]==nums[i-1]){
            c++;
         }
         else{
            if(c>(n/3)){
                ans.add(nums[i-1]);
            }
            c=1;
         }
      }
      if(c>(n/3)){
        ans.add(nums[n-1]);
              }  
              return ans;
    }
}
