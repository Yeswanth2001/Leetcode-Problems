class Solution {
    private static void mergeSortedArray(int[] arr, int left, int mid, int right) {
		
		int n1 = mid-left + 1;
		int n2 = right - mid;
		
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];
		
		System.arraycopy(arr, left, leftArray, 0, n1);
		System.arraycopy(arr, mid+1, rightArray, 0, n2);
		
		int i=0,j=0;
		int k= left ;
		
		while (i<n1 && j<n2) {
			
			if(leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			} else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
			
		}
		
		while (i < n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		
		while (j < n2) {
			arr[k] = rightArray[j];
			j++;
			k++;
		}
		
	}
	
	
	private static void mergeSort(int[] arr, int left, int right) {
//		if(arr == null || arr.length == 0)
//			return;
		
		if(left < right) {
			int mid = left + ( right - left) / 2;
			
			mergeSort(arr, left, mid);
			mergeSort(arr, mid+1, right);
			
			mergeSortedArray(arr, left, mid, right);
			
		}
		
	}

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
}