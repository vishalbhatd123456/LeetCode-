class Solution {
    public int removeDuplicates(int[] nums) {
   
        int j = 1;
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1])
               {
                   nums[j] = nums[i]; //update the nums array
                   //reader and a writer pointer
                   
                   j++;
               }
        }
               return j;

    }
}
