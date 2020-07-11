class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
        Set<List<Integer>> result = new HashSet<>();
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++)
        {
            int current = nums[i];
            int left = i+1;
            int right = nums.length-1;
            
            while(left<right)
            {
                int sum = current+nums[left]+nums[right];
                if(sum == 0)
                    result.add(Arrays.asList(current,nums[left++],nums[right--]));
                else if(sum<0)left++;
                else if(sum>0) right--;
            }
        }
        return new ArrayList<>(result);
}
}
