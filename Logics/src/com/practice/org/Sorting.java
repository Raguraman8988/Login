package com.practice.org;

public class Sorting {
	public int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1); // index of smaller element
		for (int j = low; j < high; j++) {
			// if current element is smaller than or equal to pivot
			if (arr[j] <= pivot) {
				i++;
				// swap arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// swap arr[i+1] and arr[high] (or pivot)
		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;

		return i + 1;
	}
	/*
	 * the main method that implements QuickSort()
	 * arr[]--> Array to be sorted, 
	 * low--> starting index,
	 * high--> ending index 
	 */
	public void sort(int arr[], int low, int high) {
		if (low<high) {
			//pi is partitioning index, arr[pi] is not at right place
			int pi=partition(arr,low,high);
			// Recursively sort element before
			// partition and after partition
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}
	// Always utility method to print array of size n
	public static void printArray(int arr[]) {
		int n=arr.length;
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {10,7,8,9,1,5};
		int n=arr.length;
		
		Sorting ob=new Sorting();
		ob.sort(arr, 0, n-1);
		System.out.println("Sorted Array");
		printArray(arr);
		
		
		
		
		
	}
}
