class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = nums[0]+nums[1]+nums[nums.length-1];
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++)
        {
            int a_ptr = i+1;
            int b_ptr = nums.length-1;
            
            while(a_ptr<b_ptr)
            {
                int curr_sum = nums[i]+nums[a_ptr]+nums[b_ptr];
                
                if(curr_sum>target)
                {
                    b_ptr--;
                }
                else
                {
                    a_ptr++;
                }
                if(Math.abs(curr_sum-target)<Math.abs(result-target))
                {
                    result = curr_sum;
                }
            }
        }
        return result;
            
        
    }
}
