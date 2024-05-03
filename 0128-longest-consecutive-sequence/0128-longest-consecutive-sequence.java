class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length < 1) return 0;
        Arrays.sort(nums);
        int count = 1, res = 1;

        for(int i=1;i<nums.length;i++) {
            if(nums[i]-nums[i-1] == 1) {
                count++;
                res = Math.max(count,res);
            } else if(nums[i] != nums[i-1]) {
                count = 1;
            }
        }
        return res;
    }
}