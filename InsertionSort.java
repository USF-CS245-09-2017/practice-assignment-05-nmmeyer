//insertsort 
import java.util.Arrays;

public class InsertionSort implements SortingAlgorithm {
	public void sort (int [] a){
		int temp=0;
		int j=0;
		int i=0;
		for (i=1;i<a.length;i++){
			temp = a[i];
			j = i-1;
		
		
			while(j>=0 && a[j] > temp){
				a[j+1] = a[j];
				j--; 
			}
			a[j+1] = temp; 
		}
		//System.out.println(Arrays.toString(a));
	} 

	public static void main (String[] args){
		int[]a ={56,3,6,72};
		InsertionSort i= new InsertionSort();
		i.sort(a);


	}
}