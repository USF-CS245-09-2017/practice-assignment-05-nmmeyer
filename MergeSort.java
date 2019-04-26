//merge sort 
import java.util.*; 
public class MergeSort implements SortingAlgorithm
{

	public void sort (int []a)
	{
		if (a.length>1){
			int mid = a.length/2;
			int[] right = new int[mid];
			int[] left = new int[a.length-mid]; 
			sort(left);
			sort(right);
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