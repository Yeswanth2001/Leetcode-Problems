class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int sum = 0, count = 0;
        for(int i : nums) {
            sum += i;
            if(sum == k) count++;

            if(map.containsKey(sum-k)) {
                count += map.get(sum-k);
            }

            if(map.containsKey(sum)) {
                map.put(sum,map.get(sum)+1);
            }else {
                map.put(sum,1);
            }
        }
        return count;
    }
}