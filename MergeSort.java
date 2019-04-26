//merge sort 
import java.util.*; 
public class MergeSort implements SortingAlgorithm
{

	public void sort (int []a){
		mergeSort(a);
	}
	public void mergeSort(int[]a){
		if (a.length>1){
			int mid = a.length/2;
			int[] left = new int[mid];
			int[] right = new int[a.length-mid]; 
			System.arraycopy(a,0,left,0,mid);
			System.arraycopy(a,mid,right,0,a.length-mid);
			mergeSort(left);
			mergeSort(right);
			merge(left,right,a);
		}
	}
	public void merge (int[] left, int[] right, int[] a){
		int leftIndex = 0;
		int rightIndex = 0;
		int targetIndex = 0; 
		
		while (leftIndex < left.length && rightIndex < right.length){
			if (left[leftIndex] <= right[rightIndex]){
				a[targetIndex++] = left[leftIndex++];
			}
			
			else{
				a[targetIndex++] = right[rightIndex++];
			}
		}
		
		while (leftIndex < left.length){
			a[targetIndex++] = left[leftIndex++];
		}
		
		while (rightIndex < right.length){
			a[targetIndex++] = right[rightIndex++];
		}
	}
}