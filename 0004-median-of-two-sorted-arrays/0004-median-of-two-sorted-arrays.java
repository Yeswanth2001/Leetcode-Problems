class Solution {

    public int[] mergeSort(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] arr = new int[n1+n2];

        int i=0,j=0,k=0;
        while(i < n1 && j < n2) {
            if(nums1[i] < nums2[j]) arr[k++] = nums1[i++];
            else arr[k++] = nums2[j++];
        }

        while(i < n1) arr[k++] = nums1[i++];
        while(j < n2) arr[k++] = nums2[j++];
        return arr;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = mergeSort(nums1, nums2);

        if(arr.length%2 != 0) {
            return arr[arr.length/2];
        }

        return (arr[arr.length/2] + arr[(arr.length/2)-1])/2d;
    }
}