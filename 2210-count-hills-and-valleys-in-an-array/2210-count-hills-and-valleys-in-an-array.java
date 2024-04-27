class Solution {
    public int countHillValley(int[] nums) {
        int res = 0;
        for(int i=1;i<nums.length-1;i++) {
             if( nums[i] > nums[i-1] && nums[i] > nums[i+1] )
                res++;
            if( nums[i] < nums[i-1] && nums[i] < nums[i+1] )
                res++;
            if( nums[i] == nums[i+1] )
                nums[i] = nums[i-1] ;
        }
        return res;
    }
}