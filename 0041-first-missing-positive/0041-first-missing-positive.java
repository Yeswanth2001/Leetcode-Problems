class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] arr = new int[nums.length+1];
        for(int i : nums) {
            if(i > 0 && i <= nums.length) arr[i]++;
        }
     //   System.out.println(Arrays.toString(arr));
        for(int i=1;i<arr.length;i++) {
            if(arr[i] == 0) return i;
        }

        return nums.length+1;

    }
}