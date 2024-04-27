class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int l = 0, h = arr.length-k;
        while(l < h) {
            int mid = l+(h-l)/2;
            if(x-arr[mid] <= arr[mid+k]-x) h = mid;
            else l = mid+1;
        }
        for(int i=l;i<l+k;i++) list.add(arr[i]);
        return list;
    }
}