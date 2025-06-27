Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:
Input: nums = [1,3,5,6], target = 2
Output: 1



  Answer:

class Solution {
    public int searchInsert(int[] nums, int target) {
      int i=0;
      int j=nums.length-1;
      while(i<=j){
        int a=i+(j-i);
        if(nums[a]==target){
            return a;
        }
         else  if(nums[a]>target){
                j=a-1;
            }
            else{
                i=a+1;
            }
      } 
      return i; 
    }
}
