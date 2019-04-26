//Quicksort
import java.util.*; 
public class QuickSort implements SortingAlgorithm
{

	public void sort (int []a){
		quickSort(a,0,a.length-1); 
	}
	public void quickSort(int[]a, int low, int high){
		if (high-low > 0){
			int pivot = partition(a,low,high);
			quickSort (a,low,pivot-1);
			quickSort (a,pivot+1, high);
		}
	}
	
	public void swap(int[] arr,int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public int partition(int[]a, int low, int high){
		int pivot = low;
		int i = low + 1;
		int j = high; 
		
		while (i<=j){
			while (i<=j && a[i]<=a[pivot]){
				i++;
			}
			
			while (j>=i && a[j] >= a[pivot]){
				j--;
			}
			if (i<j){
			swap(a,i,j); 
			}
		}
		
		swap(a, pivot, j); 
		return j; 
	}
}
			