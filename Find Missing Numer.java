class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        int count_min = 0;
        
        for(int i:nums)
        {
            if(i == count_min)
            {
                count_min++;
            }
        }
        return count_min;
        
        
    }
}
