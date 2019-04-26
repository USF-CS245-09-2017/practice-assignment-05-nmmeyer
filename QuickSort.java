//Quicksort
import java.util.*; 
public class QuickSort implements SortingAlgorithm
{

	public void sort (int []a){
		quickSort(a,0,a.length); 
	}
	public void quickSort(int[]a, int high, int low){
		if (high-low > 1){
			int pivot = partition(a,high,low);
			quickSort (a,pivot-1,low);
			quickSort (a,high,pivot+1);
		}
	}
	
	public void swap(int[] arr,int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public int partition(int[]a, int high, int low){
		int pivot = low;
		int i = low + 1;
		int j = high; 
		
		while (i<j){
			while (i<j && a[i]<a[pivot]){
				i++;
			}
			
			while (j>i && a[j] > a[pivot]){
				j--;
			}
		}
		if (i<j){
			swap(a,i,j); 
		}
		swap(a, pivot, j); 
		return j; 
	}
}
			