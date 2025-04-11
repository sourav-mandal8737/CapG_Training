package Merge_Sort;

	import java.util.Arrays;

	public class MergeSort {
	    public static void main(String[] args) {
	        int[] arr = {6, 3, 9, 5, 2, 8};
	        System.out.println("Original Array: "+Arrays.toString(arr));
	        divide(arr, 0, arr.length - 1);
	        System.out.println("Sorted Array: "+Arrays.toString(arr));
	    }

	    public static void divide(int[] arr, int start, int end) {
	        if (start >= end) {
	            return;
	        }

	        int mid = start + (end - start) / 2;
	        divide(arr, start, mid);
	        divide(arr, mid + 1, end);
	        conquer(arr, start, mid, end);
	    }

	    public static void conquer(int[] arr, int start, int mid, int end) {
	        int leftArrayLength = mid - start + 1;
	        int rightArrayLength = end - mid;

	        // temp arrays
	        int[] left = new int[leftArrayLength];
	        int[] right = new int[rightArrayLength];

	        // copying data to temp arrays
	        for (int i = 0; i < leftArrayLength; i++) {
	            left[i] = arr[start + i];
	        }

	        for (int i = 0; i < rightArrayLength; i++) {
	            right[i] = arr[mid + 1 + i];
	        }

	        // merge temp arrays
	        int i = 0, j = 0, k = start;

	        while (i < leftArrayLength && j < rightArrayLength) {
	            if (left[i] <= right[j]) {
	                arr[k++] = left[i++];
	            } else {
	                arr[k++] = right[j++];
	            }
	        }

	        // copy remaining elements
	        while (i < leftArrayLength) {
	            arr[k++] = left[i++];
	        }

	        while (j < rightArrayLength) {
	            arr[k++] = right[j++];
	        }
	    }
	}


