class Solution {
    public int majorityElement(int[] nums) {
        int count=0, res = 0;
        for(int i : nums) {
            if(count == 0) {
                count++;
                res = i;
            }else if(res == i) count++;
            else count--;
        }
        return res;
    }
}