class Solution {

    public int binarySearch(int[] nums, int target, boolean isFirst) {
        int l = 0, h = nums.length-1;
        int index = -1;
        while(l <= h) {
            int mid = l + (h-l)/2;
            if(nums[mid] == target) index = mid;
            if(nums[mid] > target || (isFirst && nums[mid] == target)) h = mid-1;
            else l = mid+1;
        }
        return index;
    }

    public int[] searchRange(int[] nums, int target) {
        return new int[]{
            binarySearch(nums,target,true), 
            binarySearch(nums,target,false)
        };
    }
}